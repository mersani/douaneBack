package bns.tn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DELAIS_REGLEMENT")

public class delaisreglement implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_DR")
	private String drCode;
	@Column(name="LIBELLE_DR",nullable=true , length=64)
	private String drLibelle;
	@Column(name="DELAIS_DR",nullable=true , length=64)
	private Date drDelais;

	 @OneToOne(mappedBy = "delaisreglements")
	    private Declaration declaration;

	public String getDrCode() {
		return drCode;
	}

	public void setDrCode(String drCode) {
		this.drCode = drCode;
	}

	public String getDrLibelle() {
		return drLibelle;
	}

	public void setDrLibelle(String drLibelle) {
		this.drLibelle = drLibelle;
	}

	public Date getDrDelais() {
		return drDelais;
	}

	public void setDrDelais(Date drDelais) {
		this.drDelais = drDelais;
	}

	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}

	public delaisreglement(String drLibelle, Date drDelais, Declaration declaration) {
		super();
		this.drLibelle = drLibelle;
		this.drDelais = drDelais;
		this.declaration = declaration;
	}

	public delaisreglement() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}

