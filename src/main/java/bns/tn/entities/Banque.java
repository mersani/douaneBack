package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BANQUE")

public class Banque implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_BANQUE")
	   private Long bCode;
	
	@Column(name="ADRESSE_BANQUE",nullable=true , length=128)	
	 private String bAdresse;
	@Column(name="NOM_BANQUE",nullable=true )
	 private String bNom;

public Long getbCode() {
		return bCode;
	}

	public void setbCode(Long bCode) {
		this.bCode = bCode;
	}

	public String getbAdresse() {
		return bAdresse;
	}

	public void setbAdresse(String bAdresse) {
		this.bAdresse = bAdresse;
	}

	public String getbNom() {
		return bNom;
	}

	public void setbNom(String bNom) {
		this.bNom = bNom;
	}

	

	

	

	public Banque(Long bCode, String bAdresse, String bNom, List<Declaration> declaration) {
		super();
		this.bCode = bCode;
		this.bAdresse = bAdresse;
		this.bNom = bNom;
		

	}

	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}


	
	 
	 

