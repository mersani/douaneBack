package bns.tn.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RoleRepository;
import bns.tn.entities.Role;
import bns.tn.entities.Utilisateur;


@Service
public class RoleImpl implements IRole {
   @Autowired
   RoleRepository roleRepository;
   public void saveRole(Role role) {
		roleRepository.save(role);
	}
@Override
public List<Role> getRoles() {
	
	return roleRepository.findAll();
}
@Override
public void deleteRole(Long id) {
	roleRepository.deleteById(id);
}
@Override
public void updateRole(Role role, Long id ) {
	Optional<Role> rl = roleRepository.findById(id);
	if (rl.isPresent()) {
		Role rlb = rl.get();
		
		rlb.setRoleName(role.getRoleName());
		roleRepository.saveAndFlush(rlb);
	}
}
@Override
public Role getOnerole(Long id) {
	Role obj = roleRepository.findById(id).get();
	return obj;

}
}
