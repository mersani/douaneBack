package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="LOCALISATION_MARHANDISES")
@Entity
public class Localisationmarchandise implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_LM")
	private String lmCode;
	@Column(name="LIBELLEE_LM",nullable=true , length=64)
	private String lmLibellee;
	
	@OneToMany(mappedBy = "local") 
	 private List<Declaration> declaration =new ArrayList<>();

	public String getLmCode() {
		return lmCode;
	}

	public void setLmCode(String lmCode) {
		this.lmCode = lmCode;
	}

	public String getLmLibellee() {
		return lmLibellee;
	}

	public void setLmLibellee(String lmLibellee) {
		this.lmLibellee = lmLibellee;
	}

	
	public Localisationmarchandise(String lmLibellee) {
		super();
		this.lmLibellee = lmLibellee;
		
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public Localisationmarchandise() {
		super();
		// TODO Auto-generated constructor stub
	} 
	 
}

