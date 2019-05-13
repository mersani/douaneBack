package bns.tn.Services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import bns.tn.entities.Utilisateur;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {
	@Autowired
	private AccountService accountService ;
	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
		Utilisateur user=accountService.findUserByUserName(username);
		System.out.println("userdetailserice" + username);
		System.out.println("user found"+user);
		if (user==null) throw new UsernameNotFoundException(username);
		System.out.println("user trouver");
		Collection<GrantedAuthority> authorities = new ArrayList<> ();
		user.getRole().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
		});
		System.out.println("utilisateurs trouver" + authorities);
		return new User(user.getUsername(), user.getPassword(),authorities);
	
	
		 
		
	}

}
