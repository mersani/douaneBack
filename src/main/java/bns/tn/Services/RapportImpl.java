package bns.tn.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RapportRepository;
import bns.tn.entities.Rapport;

@Service
public class RapportImpl implements IRapport {
	@Autowired
	private RapportRepository rapportRepository;

	public void saveRapport(Rapport rapport) {
		rapportRepository.save(rapport);
	}

	@Override
	public List<Rapport> getRapports() {
		return rapportRepository.findAll();
	}

	@Override
	public void updateRapport(Rapport rapport, Long rapId) {
		Optional<Rapport> rap = rapportRepository.findById(rapId);
		if (rap.isPresent()) {
			Rapport rapo = rap.get();
			rapo.setRapTexte(rapport.getRapTexte());
			rapportRepository.saveAndFlush(rapo);
		}
	}

	@Override
	public void deleteRapport(Long rapId) {
		rapportRepository.deleteById(rapId);
	}

	@Override
	public Rapport getOnerap(Long rapId) {
		Rapport obj = rapportRepository.findById(rapId).get();
		return obj;
	}
}
