package bns.tn.entities;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="INTERVENANT")


public class Intervenant extends Utilisateur {
	

	
	
	@Column(name="MATRICULE_INTERVENANT",nullable=true , length=64)
     private String intMatricule;

	@OneToMany(mappedBy = "intervenant") 
	private List<Affectation> affectation =new ArrayList<>();

	public String getIntMatricule() {
		return intMatricule;
	}

	public void setIntMatricule(String intMatricule) {
		this.intMatricule = intMatricule;
	}

	public List<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(List<Affectation> affectation) {
		this.affectation = affectation;
	}

	public Intervenant(String intMatricule, List<Affectation> affectation) {
		super();
		this.intMatricule = intMatricule;
		this.affectation = affectation;
	}

	public Intervenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	

	

	
}

