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


@Table(name="MODE_REGLEMENT")
@Entity
public class Modereglement implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_MR")
	private String mrCode;
	@Column(name="LIBELLEE_MR",nullable= true , length=64)
	private String mrLibellee ;
	
	@OneToMany(mappedBy = "mdreg") 
	 private List<Declaration> declaration =new ArrayList<>();

	public String getMrCode() {
		return mrCode;
	}

	public void setMrCode(String mrCode) {
		this.mrCode = mrCode;
	}

	public String getMrLibellee() {
		return mrLibellee;
	}

	public void setMrLibellee(String mrLibellee) {
		this.mrLibellee = mrLibellee;
	}

	

	

	public Modereglement(String mrCode, String mrLibellee, List<Declaration> declaration) {
		super();
		this.mrCode = mrCode;
		this.mrLibellee = mrLibellee;
		this.declaration = declaration;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public Modereglement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

