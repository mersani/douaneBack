package bns.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Table(name="RAPPORT")
@Entity
public class Rapport implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="ID_rap")
	private Long rapId;
	@Column(name="TEXTE",nullable=true )
	private String rapTexte;
	
	public Long getRapId() {
		return rapId;
	}

	public void setRapId(Long rapId) {
		this.rapId = rapId;
	}

	public String getRapTexte() {
		return rapTexte;
	}

	public void setRapTexte(String rapTexte) {
		this.rapTexte = rapTexte;
	}

	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}

	@OneToOne(mappedBy= "rapport")
	private Declaration declaration;

	public Rapport(String rapTexte, Declaration declaration) {
		super();
		this.rapTexte = rapTexte;
		this.declaration = declaration;
	}

	public Rapport() {
		super();
		// TODO Auto-generated constructor stub
	}

}
