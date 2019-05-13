package bns.tn.config.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParser.Feature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import tn.bns.titre.users.services.AccountCredentials;

import javax.servlet.FilterChain;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Siwar
 */
//@Component
public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    private static final Logger logger = LoggerFactory.getLogger(JWTLoginFilter.class);

    public JWTLoginFilter(String url, AuthenticationManager authManager) {

        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
        System.out.println("****"+ url);
    }

    @Override
    public Authentication attemptAuthentication(
            HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException {
        Authentication authentication = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(Feature.AUTO_CLOSE_SOURCE, true);

            ServletInputStream mapperis = req.getInputStream();

            AccountCredentials creds = objectMapper.readValue(mapperis, AccountCredentials.class);
            System.out.println("****" + creds.toString());
            authentication = getAuthenticationManager().authenticate(
                    new UsernamePasswordAuthenticationToken(
                            creds.getUsername(),
                            creds.getPassword())
            );
            if (authentication != null) {
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }

            return authentication;
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found");
        }
    }

    @Override
    protected void successfulAuthentication(
            HttpServletRequest req,
            HttpServletResponse res, FilterChain chain,
            Authentication auth) {
        TokenAuthenticationService
                .addAuthentication(res, auth.getName());
    }


}
