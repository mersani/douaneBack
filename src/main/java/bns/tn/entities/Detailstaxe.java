package bns.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="DETAILSTAXES")

public class Detailstaxe implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_DT")
	private Long dtCode;
	@Column(name="TAUX_DT",nullable=true , length=64)
	private Float dtTaux;
	@Column(name="BASE_IMPOSITION",nullable=true , length=64)
	private Long dtBaseimposition;
	@Column(name="MONTANT_DT",nullable=true , length=64)
	private Float dtMontant;
	
	@ManyToOne
    @JoinColumn(name="CODE_REFTAXE", nullable=false)
    private REFTaxe reftaxe;
    
    
    @OneToOne(mappedBy = "detailstaxe")
    private Declaration declaration;


	public Long getDtCode() {
		return dtCode;
	}


	public void setDtCode(Long dtCode) {
		this.dtCode = dtCode;
	}


	public Float getDtTaux() {
		return dtTaux;
	}


	public void setDtTaux(Float dtTaux) {
		this.dtTaux = dtTaux;
	}


	public Long getDtBaseimposition() {
		return dtBaseimposition;
	}


	public void setDtBaseimposition(Long dtBaseimposition) {
		this.dtBaseimposition = dtBaseimposition;
	}


	public Float getDtMontant() {
		return dtMontant;
	}


	public void setDtMontant(Float dtMontant) {
		this.dtMontant = dtMontant;
	}


	public REFTaxe getReftaxe() {
		return reftaxe;
	}


	public void setReftaxe(REFTaxe reftaxe) {
		this.reftaxe = reftaxe;
	}


	public Declaration getDeclaration() {
		return declaration;
	}


	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}


	public Detailstaxe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Detailstaxe(Float dtTaux, Long dtBaseimposition, Float dtMontant, REFTaxe reftaxe, Declaration declaration) {
		super();
		this.dtTaux = dtTaux;
		this.dtBaseimposition = dtBaseimposition;
		this.dtMontant = dtMontant;
		this.reftaxe = reftaxe;
		this.declaration = declaration;
	}
    
    
}
