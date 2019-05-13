package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="PIECESJOINTES")
@Entity

public class Piecesjointes implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_PIECESJOINTES")
	private Long pjCode;
	@Column(name="NOM_PIECESJOINTES",nullable=true , length=64)
	private String PJNomPiecesJointes;
	
	@Column(name="DATE_PIECESJOINTES",nullable=true , length=64)
	private Date pjDatePiecesJointes;
	@Column(name="TYPE_EPIECES",nullable=true , length=64)
    private String pjType;
	
	@OneToMany(mappedBy = "piecesjointes") 
	 private List<Declaration> declaration =new ArrayList<>();
	
	@OneToMany(mappedBy = "piecesjointes") 
	 private List<Typepiecesjointes> typepiecesjointes =new ArrayList<>();

	public Long getPjCode() {
		return pjCode;
	}

	public void setPjCode(Long pjCode) {
		this.pjCode = pjCode;
	}

	public String getPJNomPiecesJointes() {
		return PJNomPiecesJointes;
	}

	public void setPJNomPiecesJointes(String pJNomPiecesJointes) {
		PJNomPiecesJointes = pJNomPiecesJointes;
	}

	public Date getPjDatePiecesJointes() {
		return pjDatePiecesJointes;
	}

	public void setPjDatePiecesJointes(Date pjDatePiecesJointes) {
		this.pjDatePiecesJointes = pjDatePiecesJointes;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public List<Typepiecesjointes> getTypepiecesjointes() {
		return typepiecesjointes;
	}

	public void setTypepiecesjointes(List<Typepiecesjointes> typepiecesjointes) {
		this.typepiecesjointes = typepiecesjointes;
	}


	public String getPjType() {
		return pjType;
	}

	public void setPjType(String pjType) {
		this.pjType = pjType;
	}

	public Piecesjointes(Long pjCode, String pJNomPiecesJointes, Date pjDatePiecesJointes, String pjType,
			List<Declaration> declaration, List<Typepiecesjointes> typepiecesjointes) {
		super();
		this.pjCode = pjCode;
		PJNomPiecesJointes = pJNomPiecesJointes;
		this.pjDatePiecesJointes = pjDatePiecesJointes;
		this.pjType = pjType;
		this.declaration = declaration;
		this.typepiecesjointes = typepiecesjointes;
	}

	public Piecesjointes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
