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




@Table (name="TYPEDECLARATION")
@Entity
public class Typedeclaration implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_TYPEDECLARATIION")
	private Long typedecCode ;
	@Column(name="LIBELLEE_TYPEDECLARATION",nullable= true , length=64)
	private String typedecLibellee ;
	@ManyToOne
	@JoinColumn(name="ID_DECLARATION")
	private Declaration declaration ;
	public Long getTypedecCode() {
		return typedecCode;
	}
	public void setTypedecCode(Long typedecCode) {
		this.typedecCode = typedecCode;
	}
	public String getTypedecLibellee() {
		return typedecLibellee;
	}
	public void setTypedecLibellee(String typedecLibellee) {
		this.typedecLibellee = typedecLibellee;
	}
	public Declaration getDeclaration() {
		return declaration;
	}
	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}
	public Typedeclaration(String typedecLibellee, Declaration declaration) {
		super();
		this.typedecLibellee = typedecLibellee;
		this.declaration = declaration;
	}
	public Typedeclaration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

