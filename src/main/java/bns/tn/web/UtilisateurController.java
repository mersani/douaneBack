package bns.tn.web;

import java.util.List;

import bns.tn.Services.AccountService;
import bns.tn.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IUtilisateur;
import bns.tn.entities.Utilisateur;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "utilisateur", produces = "application/json")
public class UtilisateurController {
	@Autowired
	private IUtilisateur iUtilisateur;

	@Autowired
	private AccountService iAccountService;

	@PostMapping("/save")
	public @ResponseBody Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		System.out.println( "aaaaaaaaaaaaaa" + utilisateur.getRole().toString());
	return 	iUtilisateur.saveUtilisateur(utilisateur);


	}

	@PutMapping("/addRoleToUser/{username}")
	public Boolean addRoleToUser(@PathVariable String username, @RequestBody Role role) {
		System.out.println("user " + username.toString());
		System.out.println("******************" + role.getRoleName().toString());
		try {
			iAccountService.addRolesToUser(username, role.getRoleName());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@GetMapping("/all")
	public @ResponseBody List<Utilisateur> getAllUtilisateurs() {
		return iUtilisateur.getUtilisateurs();
	}

	@PostMapping("/update/{id}")
	public void pututilisateur(@RequestBody Utilisateur utilisateur, @PathVariable(name = "id") Long id) {
		iUtilisateur.updateUtilisateur(utilisateur, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public void deleteUtilisateur(@PathVariable(name = "id") Long id) {
		iUtilisateur.deleteUtilisateur(id);
	}

	@GetMapping ("/one/{id}")
	public @ResponseBody Utilisateur getOneuti(@PathVariable (name="id") Long id , @RequestBody Utilisateur utilisateur ) {
		return iUtilisateur.getOneuti(id);
	}
}