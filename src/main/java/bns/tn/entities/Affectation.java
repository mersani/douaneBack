package bns.tn.entities;

import java.io.Serializable;
import java.util.Date;

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

@Entity
@Table(name="AFFECTATION")

public class Affectation implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_AFF")
	private Long affCode ;
	@Column(name="DATE_AFF",nullable=true , length=64)
	private Date affDate;
	
	@ManyToOne
	@JoinColumn(name="ID_DECLARATION")
	private Declaration declaration ;
	@ManyToOne
	@JoinColumn(name="MATRICULE_INTERVENANT")
	private Intervenant intervenant ;
	public Long getAffCode() {
		return affCode;
	}
	public void setAffCode(Long affCode) {
		this.affCode = affCode;
	}
	public Date getAffDate() {
		return affDate;
	}
	public void setAffDate(Date affDate) {
		this.affDate = affDate;
	}
	public Declaration getDeclaration() {
		return declaration;
	}
	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}
	public Intervenant getIntervenant() {
		return intervenant;
	}
	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
	public Affectation(Date affDate, Declaration declaration, Intervenant intervenant) {
		super();
		this.affDate = affDate;
		this.declaration = declaration;
		this.intervenant = intervenant;
	}
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
