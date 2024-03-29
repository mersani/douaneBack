package bns.tn.config.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTAuthorizationFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		System.out.println("****** request ****");
		System.out.println(request);
		System.out.println("****** response ****");
		System.out.println(response);
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With, Content-Type, "
				+ "Access-Control-Request-Method, " + "Access-Control-Request-Headers, " + "Authorization");
		response.addHeader("Access-Control-Expose-Headers",
				"Access-Control-Allow-Origin, " + "Access-Control-Allow-Credentials, Authorization");
		if (request.getMethod().equals("OPTIONS")) {
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			String jwt = request.getHeader(SecurityConstantes.HEADER_STRING);
			System.out.println("****** token ****" + jwt);
			if (jwt == null || !jwt.startsWith(SecurityConstantes.TOKEN_PERFIX)) {
				System.out.println("---- jwt null ------");
				chain.doFilter(request, response);
				return;
			} else {
				System.out.println("---- jwt not null ------");
				Claims claims = Jwts.parser().setSigningKey(SecurityConstantes.SECRET)
						.parseClaimsJws(jwt.replace(SecurityConstantes.TOKEN_PERFIX, "")).getBody();
				String username = claims.getSubject();
				ArrayList<Map<String, String>> roles = (ArrayList<Map<String, String>>) claims.get("roles");
				Collection<GrantedAuthority> authorities = new ArrayList<>();
				roles.forEach(r -> {

					authorities.add(new SimpleGrantedAuthority(r.get("authority")));

				});
				UsernamePasswordAuthenticationToken authenticatedUser = new UsernamePasswordAuthenticationToken(
						username, null, authorities);
				SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
				chain.doFilter(request, response);
			}

		}

	}

}
