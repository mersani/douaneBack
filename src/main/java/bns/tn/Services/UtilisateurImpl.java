package bns.tn.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RoleRepository;
import bns.tn.DAO.UtilisateurRepository;
import bns.tn.entities.Utilisateur;

@Service
public class UtilisateurImpl implements IUtilisateur {

	@Autowired
	private BCryptPasswordEncoder bCrypPasswordEncoder ;
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		String hashPW = bCrypPasswordEncoder.encode(utilisateur.getPassword());
		utilisateur.setPassword(hashPW);
		return utilisateurRepository.save(utilisateur);
	}
	@Override
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurRepository.findAll();

	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur, Long id) {
		Optional<Utilisateur> utili = utilisateurRepository.findById(id);
		if (utili.isPresent()) {
			Utilisateur utilisateurb = utili.get();
			utilisateurb.setUsername(utilisateur.getUsername());
			utilisateurb.setPassword(utilisateur.getPassword());
			utilisateurb.setCin(utilisateur.getCin());
			utilisateurb.setAdresse(utilisateur.getAdresse());
			utilisateurb.setEmail(utilisateur.getEmail());
			utilisateurb.setTel(utilisateur.getTel());
			utilisateurb.setNom(utilisateur.getNom());
			utilisateurb.setPrenom(utilisateur.getPrenom());
			utilisateurRepository.saveAndFlush(utilisateurb);
		}
	}

	@Override
	public void deleteUtilisateur(Long id) {
		utilisateurRepository.deleteById(id);
	}

	@Override
	public Utilisateur getOneuti(Long id) {
		Utilisateur obj = utilisateurRepository.findById(id).get();
		return obj;

	}
}
