package bns.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="TYPEREFTAXE")
@Entity
public class Typereftaxe implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_TYPEREF")
    private  String typertCode;
	
	@Column(name="LIBELLE_TYPEREF",nullable=true , length=64)
	private String typertLibellee;

	@ManyToOne
	 @JoinColumn(name="CODE_REFTAXE")
	 private REFTaxe reftaxe ;

	public String getTypertCode() {
		return typertCode;
	}

	public void setTypertCode(String typertCode) {
		this.typertCode = typertCode;
	}

	public String getTypertLibellee() {
		return typertLibellee;
	}

	public void setTypertLibellee(String typertLibellee) {
		this.typertLibellee = typertLibellee;
	}

	public REFTaxe getReftaxe() {
		return reftaxe;
	}

	public void setReftaxe(REFTaxe reftaxe) {
		this.reftaxe = reftaxe;
	}

	public Typereftaxe(String typertLibellee, REFTaxe reftaxe) {
		super();
		this.typertLibellee = typertLibellee;
		this.reftaxe = reftaxe;
	}

	public Typereftaxe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
