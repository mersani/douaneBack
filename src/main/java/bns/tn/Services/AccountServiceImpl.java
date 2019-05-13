package bns.tn.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RoleRepository;
import bns.tn.DAO.UtilisateurRepository;
import bns.tn.entities.Role;
import bns.tn.entities.Utilisateur;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	 @Autowired
	 private BCryptPasswordEncoder bCrypPasswordEncoder ;
	 
	 @Autowired
	 private UtilisateurRepository utilisateursRepository;
	 
	 @Autowired
	 private RoleRepository rolesRepository;
	 
	 @Override
	 public Utilisateur saveUser(Utilisateur user) {
		 String hashPW = bCrypPasswordEncoder.encode(user.getPassword());
		 user.setPassword(hashPW);
		 return utilisateursRepository.save(user);
	 }
	 
	 
	 @Override
	 public Role saveRoles(Role roles) {
		 return
				 rolesRepository.save(roles);
	 }
	 
     @Override
     public void addRolesToUser(String username,String roleName) {
    	 Role Roles=rolesRepository.findByRoleName(roleName);
    	 Utilisateur user=utilisateursRepository.findByUsername(username);
    	 user.getRole().add(Roles);
    	 utilisateursRepository.saveAndFlush(user);
     }
     @Override
     public Utilisateur findUserByUserName(String userName) {
    	 return utilisateursRepository.findByUsername(userName);
     }
}
