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

@Table(name="MODE_de_TRANSPORT")
@Entity

public class Modetransport implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_MDT")
	private Long mdtCode;
	@Column(name="Libellee_MDT",nullable=true , length=64)
	private String mdtLibellee;
	
	
	@OneToMany(mappedBy = "mdtrans") 
	 private List<Declaration> declaration =new ArrayList<>();
	
	public Long getMdtCode() {
		return mdtCode;
	}
	public void setMdtCode(Long mdtCode) {
		this.mdtCode = mdtCode;
	}
	public String getMdtLibellee() {
		return mdtLibellee;
	}
	public void setMdtLibellee(String mdtLibellee) {
		this.mdtLibellee = mdtLibellee;
	}
	
	
	public List<Declaration> getDeclaration() {
		return declaration;
	}
	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}
	
	public Modetransport(Long mdtCode, String mdtLibellee, List<Declaration> declaration) {
		super();
		this.mdtCode = mdtCode;
		this.mdtLibellee = mdtLibellee;
		this.declaration = declaration;
	}
	public Modetransport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

