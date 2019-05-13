package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IRole;

import bns.tn.entities.Role;
import bns.tn.entities.Utilisateur;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "role", produces = "application/json")
public class RoleController {
	@Autowired
	private IRole iRole;

	@PostMapping("/save")
	public void saveRole(@RequestBody Role role) {
		iRole.saveRole(role);
	}

	@GetMapping("/all")
	public @ResponseBody List<Role> getAllRoles() {
		return iRole.getRoles();
	}

	@PostMapping("/update/{id}")
	public void putrole(@PathVariable(name = "id") Long id, @RequestBody Role role) {
		iRole.updateRole(role, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public void deleterole(@PathVariable(name = "id") Long id) {
		iRole.deleteRole(id);
	}
	@GetMapping ("/one/{id}")
	public @ResponseBody Role getOnerole(@PathVariable (name="id") Long id ,Role role ) {
		return iRole.getOnerole(id);
	}
}
