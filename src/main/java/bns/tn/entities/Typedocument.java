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


@Entity

@Table(name="TYPE_DOC")
public class Typedocument implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_DOC")
	private String docCode;
	@Column(name="NUM_DOC",nullable=true , length=28)
    private Long docNum ;
	@Column(name="VALEUR_DOC",nullable=true , length=64)
    private String docValeur ;
	@Column(name="QUANTITE_DOC",nullable=true , length=64)
    private String docQte;
	public String getDocCode() {
		return docCode;
	}
	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}
	public Long getDocNum() {
		return docNum;
	}
	public void setDocNum(Long docNum) {
		this.docNum = docNum;
	}
	public String getDocValeur() {
		return docValeur;
	}
	public void setDocValeur(String docValeur) {
		this.docValeur = docValeur;
	}
	public String getDocQte() {
		return docQte;
	}
	public void setDocQte(String docQte) {
		this.docQte = docQte;
	}
	public Typedocument(Long docNum, String docValeur, String docQte) {
		super();
		this.docNum = docNum;
		this.docValeur = docValeur;
		this.docQte = docQte;
	}
	public Typedocument() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
