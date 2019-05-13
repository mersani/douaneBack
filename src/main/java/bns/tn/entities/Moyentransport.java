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


@Table(name="MOYEN_TRANSPORT")
@Entity
public class Moyentransport implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_MOYENT")
	private String moyentCode;
	@Column(name="Libellee_MOYENT",nullable=true , length=64)
	private String moyentLibellee;
	@Column(name="NATIONNALITE_MOYENT",nullable=true , length=64)
	private String moyentNationnalite;

	@OneToMany(mappedBy = "mtrans") 
	 private List<Declaration> declaration =new ArrayList<>();
	
	@OneToMany(mappedBy = "moyentransport") 
	 private List<Typemoyentransport> typemoyentransport =new ArrayList<>();

	public String getMoyentCode() {
		return moyentCode;
	}

	public void setMoyentCode(String moyentCode) {
		this.moyentCode = moyentCode;
	}

	public String getMoyentLibellee() {
		return moyentLibellee;
	}

	public void setMoyentLibellee(String moyentLibellee) {
		this.moyentLibellee = moyentLibellee;
	}

	public String getMoyentNationnalite() {
		return moyentNationnalite;
	}

	public void setMoyentNationnalite(String moyentNationnalite) {
		this.moyentNationnalite = moyentNationnalite;
	}

	

	public List<Typemoyentransport> getTypemoyentransport() {
		return typemoyentransport;
	}

	public void setTypemoyentransport(List<Typemoyentransport> typemoyentransport) {
		this.typemoyentransport = typemoyentransport;
	}

	

	public Moyentransport(String moyentCode, String moyentLibellee, String moyentNationnalite,
			List<Declaration> declaration, List<Typemoyentransport> typemoyentransport) {
		super();
		this.moyentCode = moyentCode;
		this.moyentLibellee = moyentLibellee;
		this.moyentNationnalite = moyentNationnalite;
		this.declaration = declaration;
		this.typemoyentransport = typemoyentransport;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public Moyentransport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

