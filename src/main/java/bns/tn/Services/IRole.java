package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Role;
import bns.tn.entities.Utilisateur;


public interface IRole {
	public void saveRole(Role role);
	public List<Role>getRoles();
	public void updateRole(Role role , Long id);
	public void deleteRole(Long id);
	public Role getOnerole (Long id);
	

}
