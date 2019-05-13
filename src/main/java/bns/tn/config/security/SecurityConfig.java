package bns.tn.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(false);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		config.addExposedHeader("Authorization");
		config.addExposedHeader("auth");
		source.registerCorsConfiguration("/**", config);
		return source;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.cors().and()
				.csrf().disable()
				.httpBasic().disable()
				.authorizeRequests()

				.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				.antMatchers("/login").permitAll()
				.anyRequest().authenticated()
			//	.antMatchers("/report/**").permitAll()
				.and()
				.headers()
				.frameOptions()
				.disable()
				.and()
				//    We filter the api/login requests
				.addFilterBefore(new JWTLoginFilter("/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
				// And filter other requests to check the presence of JWT in header
				.addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
				.formLogin()
				.loginProcessingUrl("/login")
				.and()
				// this disables session creation on Spring Security
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

	}

}

	
	

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		System.out.println("security config");
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/* http.addFilterBefore(corsFilter(), SessionManagementFilter.class); */
		/*http.cors().and()
        .csrf().disable()
        .httpBasic().disable()
        .authorizeRequests()
        .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
        .antMatchers("/login").permitAll()
        .anyRequest().authenticated()
        .and()
        .headers()
        .frameOptions()
        .disable();
        //    We filter the api/login requests
		http.addFilter(new JWTAuthenticationFilter(authenticationManager()))
        // And filter other requests to check the presence of JWT in header
        .addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
        .formLogin()
        .loginProcessingUrl("/login")
        .and()*/
        // this disables session creation on Spring Security
     //   .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
	/*	http.cors().and().csrf().disable().httpBasic().disable().
		authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.antMatchers("/login").permitAll()*/
		
		

		/* http.authorizeRequests().antMatchers("users").permitAll(); */

		//http.authorizeRequests().antMatchers(HttpMethod.POST, "/tasks/**").hasAuthority("ADMIN");
	/*	http.authorizeRequests().anyRequest().authenticated();
		http.addFilter(new JWTAuthenticationFilter(authenticationManager()));
		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);*/
		
	//}*/


