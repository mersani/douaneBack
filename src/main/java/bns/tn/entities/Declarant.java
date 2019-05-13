package bns.tn.entities;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name="DECLARANT")
@Entity

public class Declarant extends Utilisateur{
	@Column(name="CODE_DECLARANT",nullable=true , length=20)
	private String declCode;
	@Column(name="NUMAGREMENT_DECLARANT",nullable=true , length=64)
	private String declNumagrement;
	@Column(name="RAISONSOCIAL_DECLARANT",nullable=true , length=64)
	private String declRaisonSocial;
	
	@OneToMany(mappedBy = "dec") 
	 private List<Declaration> declaration =new ArrayList<>();
	
	
	public String getDeclNumagrement() {
		return declNumagrement;
	}
	public void setDeclNumagrement(String declNumagrement) {
		this.declNumagrement = declNumagrement;
	}
	public String getDeclRaisonSocial() {
		return declRaisonSocial;
	}
	public void setDeclRaisonSocial(String declRaisonSocial) {
		this.declRaisonSocial = declRaisonSocial;
	}
	
	public String getDeclCode() {
		return declCode;
	}
	public void setDeclCode(String declCode) {
		this.declCode = declCode;
	}
	public List<Declaration> getDeclaration() {
		return declaration;
	}
	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}
	
	public Declarant(String username, String password, String nom, String prenom, String email, String adresse,
			Integer tel, String cin, List<Role> role, String declNumagrement, String declRaisonSocial,
			List<Declaration> declaration) {
		super(username, password, nom, prenom, email, adresse, tel, cin, role);
		this.declNumagrement = declNumagrement;
		this.declRaisonSocial = declRaisonSocial;
		this.declaration = declaration;
	}
	public Declarant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 
  
}