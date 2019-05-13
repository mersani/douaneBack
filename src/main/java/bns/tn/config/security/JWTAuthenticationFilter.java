package bns.tn.config.security;

import org.springframework.security.core.Authentication;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthenticationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain)
            throws IOException, ServletException {


        Authentication authentication = TokenAuthenticationService
                .getAuthentication((HttpServletRequest) request);

        SecurityContextHolder.getContext()
                .setAuthentication(authentication);

        filterChain.doFilter(request, response);
    }
	/*private AuthenticationManager authenticationManager;

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		super();
		this.authenticationManager = authenticationManager;
	}
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
            Utilisateur user=null;
            
            try {
				user= new ObjectMapper().readValue(request.getInputStream(), Utilisateur.class);
				System.out.println("user attempt " + user);
			} catch (Exception e) {
            throw new RuntimeException(e);
			}
            System.out.println("--------------");
            System.out.println("-UserName-" +user.getUsername());
            System.out.println("-Password-" +user.getPassword());
            		return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {

		User springUser=(User) authResult.getPrincipal();
		System.out.println("*** sucessful ****" +springUser);
		String jwt= Jwts.builder().setSubject(springUser.getUsername())
				.setExpiration(new Date(System.currentTimeMillis()+SecurityConstantes.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SecurityConstantes.SECRET).claim("roles",springUser.getAuthorities())
				.compact();
		response.addHeader(SecurityConstantes.HEADER_STRING, SecurityConstantes.TOKEN_PERFIX+jwt);
		System.out.println("jwt " + jwt);
	
	}
*/	
}


