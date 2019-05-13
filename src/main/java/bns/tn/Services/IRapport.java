package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Rapport;

public interface IRapport {
	public void saveRapport(Rapport rapport);

	public List<Rapport> getRapports();

	public void updateRapport(Rapport rapport, Long rapId);

	public void deleteRapport(Long rapId);

	public Rapport getOnerap(Long rapId);
}
