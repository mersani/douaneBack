package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="INCOTERM")

public class Incoterm implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_INCOTERM")
	private String incCode ;
	@Column(name="LIBELLE_INCOTERM",nullable=true , length=20)
	 private String incLibelle;
	@Column(name = "CODE_SUPP")
	private String incCodesSupp;


	public String getIncCode() {
		return incCode;
	}

	public void setIncCode(String incCode) {
		this.incCode = incCode;
	}

	public String getIncLibelle() {
		return incLibelle;
	}

	public void setIncLibelle(String incLibelle) {
		this.incLibelle = incLibelle;
	}

	


	
	public Incoterm(String incCode, String incLibelle, String incCodesSupp, List<Declaration> declaration) {
		super();
		this.incCode = incCode;
		this.incLibelle = incLibelle;
		this.incCodesSupp = incCodesSupp;

	}

	public String getIncCodesSupp() {
		return incCodesSupp;
	}

	public void setIncCodesSupp(String incCodesSupp) {
		this.incCodesSupp = incCodesSupp;
	}

	public Incoterm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
