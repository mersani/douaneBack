package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Utilisateur;

public interface IUtilisateur {
	public Utilisateur saveUtilisateur(Utilisateur utilisateur);

	public List<Utilisateur> getUtilisateurs();

	public void updateUtilisateur(Utilisateur utilisateur, Long id);
	
	public void deleteUtilisateur(Long id);
	
	public Utilisateur getOneuti(Long id);

}
