package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Localisationmarchandise;

public interface LocalisationRepository extends JpaRepository<Localisationmarchandise,Long>{
	public Localisationmarchandise findByLmCode (String lmCode);

}