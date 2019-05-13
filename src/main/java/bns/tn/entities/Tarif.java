package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="TARIF")
@Entity
public class Tarif implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_TARIF")
	private Long tCodeTarif;
	
	@Column(name="CODE_SH",nullable=true , length=64)
     private Long tCodeSh;
	
	@Column(name="TAUX_TARIF",nullable=true , length=64)
	 private Float tTauxTarif;
	@Column(name="DATEDEBUTVALIDITE_TARIF",nullable=true , length=64)
	 private Date tDateDebutValiditeTarif;
	@Column(name="DATEFINVALIDITE_TARIF",nullable=true , length=64)
	 private Date tDateFinValiditeTarif;
 
	@OneToMany(mappedBy = "tarif") 
	 private java.util.List<RefSh> refsh =new ArrayList<>();

	public Long gettCodeTarif() {
		return tCodeTarif;
	}

	public void settCodeTarif(Long tCodeTarif) {
		this.tCodeTarif = tCodeTarif;
	}

	public Long gettCodeSh() {
		return tCodeSh;
	}

	public void settCodeSh(Long tCodeSh) {
		this.tCodeSh = tCodeSh;
	}

	public Float gettTauxTarif() {
		return tTauxTarif;
	}

	public void settTauxTarif(Float tTauxTarif) {
		this.tTauxTarif = tTauxTarif;
	}

	public Date gettDateDebutValiditeTarif() {
		return tDateDebutValiditeTarif;
	}

	public void settDateDebutValiditeTarif(Date tDateDebutValiditeTarif) {
		this.tDateDebutValiditeTarif = tDateDebutValiditeTarif;
	}

	public Date gettDateFinValiditeTarif() {
		return tDateFinValiditeTarif;
	}

	public void settDateFinValiditeTarif(Date tDateFinValiditeTarif) {
		this.tDateFinValiditeTarif = tDateFinValiditeTarif;
	}

	public java.util.List<RefSh> getRefsh() {
		return refsh;
	}

	public void setRefsh(java.util.List<RefSh> refsh) {
		this.refsh = refsh;
	}

	public Tarif(Long tCodeSh, Float tTauxTarif, Date tDateDebutValiditeTarif, Date tDateFinValiditeTarif,
			java.util.List<RefSh> refsh) {
		super();
		this.tCodeSh = tCodeSh;
		this.tTauxTarif = tTauxTarif;
		this.tDateDebutValiditeTarif = tDateDebutValiditeTarif;
		this.tDateFinValiditeTarif = tDateFinValiditeTarif;
		this.refsh = refsh;
	}

	public Tarif() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

 
 
}