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

@Table(name="TYPEPIECES")
@Entity

public class Typepiecesjointes implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_TYPEPIECES")
    private  Long pjtCode;
	
	@Column(name="LIBELLE_TYPEPIECES",nullable=true , length=64)
    private String pjtLibelle;

	@ManyToOne
	 @JoinColumn(name="CODE_PIECESJOINTES")
	 private Piecesjointes piecesjointes ;

	public Long getPjtCode() {
		return pjtCode;
	}

	public void setPjtCode(Long pjtCode) {
		this.pjtCode = pjtCode;
	}

	public String getPjtLibelle() {
		return pjtLibelle;
	}

	public void setPjtLibelle(String pjtLibelle) {
		this.pjtLibelle = pjtLibelle;
	}

	public Piecesjointes getPiecesjointes() {
		return piecesjointes;
	}

	public void setPiecesjointes(Piecesjointes piecesjointes) {
		this.piecesjointes = piecesjointes;
	}

	public Typepiecesjointes(String pjtLibelle, Piecesjointes piecesjointes) {
		super();
		this.pjtLibelle = pjtLibelle;
		this.piecesjointes = piecesjointes;
	}

	public Typepiecesjointes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

