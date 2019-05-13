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



@Entity
@Table(name="REGIME_DOUANE")

public class Regimedouane implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_RD",nullable= true , length=64)
	private Long rdCode;
	@Column(name="LIBELLEE_RD",nullable= true )
	private String rdLibellee ;
	@Column(name="code_additionel_RD",nullable= true , length=64)
	private Long rdCodeadd ;
	
	@OneToMany(mappedBy = "rdouane") 
	 private List<Declaration> declaration =new ArrayList<>();

	public Long getRdCode() {
		return rdCode;
	}

	public void setRdCode(Long rdCode) {
		this.rdCode = rdCode;
	}

	public String getRdLibellee() {
		return rdLibellee;
	}

	public void setRdLibellee(String rdLibellee) {
		this.rdLibellee = rdLibellee;
	}

	public Long getRdCodeadd() {
		return rdCodeadd;
	}

	public void setRdCodeadd(Long rdCodeadd) {
		this.rdCodeadd = rdCodeadd;
	}



	public Regimedouane(Long rdCode, String rdLibellee, Long rdCodeadd, List<Declaration> declaration) {
		super();
		this.rdCode = rdCode;
		this.rdLibellee = rdLibellee;
		this.rdCodeadd = rdCodeadd;
		this.declaration = declaration;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public Regimedouane() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
