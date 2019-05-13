package bns.tn.config.security;


import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
//import tn.bns.tools.SecurityConstants;///
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * @author Siwar
 */
class TokenAuthenticationService {

    private static final Logger logger = LoggerFactory.getLogger(TokenAuthenticationService.class);

    static void addAuthentication(HttpServletResponse res, String username) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails springSecurityUser = (UserDetails) auth.getPrincipal();
        String authorities = springSecurityUser.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        String JWT = Jwts.builder()
                .setSubject(username)
                .claim("auth", authorities)
                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstantes.EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SecurityConstantes.SECRET)
                .compact();
        res.addHeader(SecurityConstantes.HEADER_STRING, SecurityConstantes.TOKEN_PERFIX + " " + JWT);
        res.addHeader("auth", authorities);

    }

    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(SecurityConstantes.HEADER_STRING);
        if (token != null) {
            // parse the token.
            Claims claims = Jwts.parser()
                    .setSigningKey(SecurityConstantes.SECRET)
                    .parseClaimsJws(token.replace(SecurityConstantes.TOKEN_PERFIX, ""))
                    .getBody();

            Collection<? extends GrantedAuthority> authorities =
                    Arrays.stream(claims.get("auth").toString().split(","))
                            .map(SimpleGrantedAuthority::new)
                            .collect(Collectors.toList());


            org.springframework.security.core.userdetails.User principal = new org.springframework.security.core.userdetails.User(claims.getSubject(), "", authorities);

            //   return new UsernamePasswordAuthenticationToken(principal, token, authorities);

            return claims.getSubject() != null
                    ? new UsernamePasswordAuthenticationToken(principal, token, authorities)
                    : null;
        }
        return null;
    }
}
