package bns.tn.Services;

import bns.tn.entities.Role;
import bns.tn.entities.Utilisateur;

public interface AccountService {
 public Utilisateur saveUser(Utilisateur user);
 public Role saveRoles(Role roles);
 public void addRolesToUser(String username,String roleName);
 public Utilisateur findUserByUserName(String userName);
}
