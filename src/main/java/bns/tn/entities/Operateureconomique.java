package bns.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table (name="OPERATEUR_ECONOMIQUE")
@Entity

public class Operateureconomique implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_DOUANE_OP")
	private String opCodeD;
	@Column(name="Nom_OP",nullable= true , length=64)
	private String opNom;
	@Column(name="PRENOM_OP",nullable= true , length=64)
	private String opPrenom;
	@Column(name="ADRESSE_OP",nullable= true , length=128)
	private String opAdresse;
	@Column(name="EMAIL_OP",nullable= true , length=128)
	private String opEmail;
	@Column(name="TYPE_OP",nullable= true , length=64)
	private String opType;
	@Column(name="TEL_OP",nullable= true , length=28)
	private Long opTel;
	@Column(name="RAISON_SOCIAL_OP",nullable= true , length=64)
	private String opRS;
	@Column(name="Matricule_FISCAL_OP",nullable= true , length=64)
	private String opMF;
	
	@OneToOne(mappedBy = "operateureconomique")
    private Declaration declaration;

	public String getOpCodeD() {
		return opCodeD;
	}

	public void setOpCodeD(String opCodeD) {
		this.opCodeD = opCodeD;
	}

	public String getOpNom() {
		return opNom;
	}

	public void setOpNom(String opNom) {
		this.opNom = opNom;
	}

	public String getOpPrenom() {
		return opPrenom;
	}

	public void setOpPrenom(String opPrenom) {
		this.opPrenom = opPrenom;
	}

	public String getOpAdresse() {
		return opAdresse;
	}

	public void setOpAdresse(String opAdresse) {
		this.opAdresse = opAdresse;
	}

	public String getOpEmail() {
		return opEmail;
	}

	public void setOpEmail(String opEmail) {
		this.opEmail = opEmail;
	}

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public Long getOpTel() {
		return opTel;
	}

	public void setOpTel(Long opTel) {
		this.opTel = opTel;
	}

	public String getOpRS() {
		return opRS;
	}

	public void setOpRS(String opRS) {
		this.opRS = opRS;
	}

	public String getOpMF() {
		return opMF;
	}

	public void setOpMF(String opMF) {
		this.opMF = opMF;
	}

	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}

	public Operateureconomique(String opNom, String opPrenom, String opAdresse, String opEmail, String opType,
			Long opTel, String opRS, String opMF, Declaration declaration) {
		super();
		this.opNom = opNom;
		this.opPrenom = opPrenom;
		this.opAdresse = opAdresse;
		this.opEmail = opEmail;
		this.opType = opType;
		this.opTel = opTel;
		this.opRS = opRS;
		this.opMF = opMF;
		this.declaration = declaration;
	}

	public Operateureconomique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

