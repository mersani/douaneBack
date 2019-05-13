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


@Table(name="REFDEVISE")
@Entity
public class REFdevise implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_REFDEVIDSE")
private String refdCode;
	@Column(name="LIBELLEE_REFDEVISE",nullable=true , length=64)
private String refdLibellee;
	@Column(name="MONTANTTOTAL_REFFDEVISE",nullable=true , length=64)
private Float refdMontantTotal;

	
	/*@OneToMany(mappedBy = "refdevise")
	 private List<Declaration> declaration = new ArrayList<>();*/


	public String getRefdCode() {
		return refdCode;
	}


	public void setRefdCode(String refdCode) {
		this.refdCode = refdCode;
	}


	public String getRefdLibellee() {
		return refdLibellee;
	}


	public void setRefdLibellee(String refdLibellee) {
		this.refdLibellee = refdLibellee;
	}


	public Float getRefdMontantTotal() {
		return refdMontantTotal;
	}


	public void setRefdMontantTotal(Float refdMontantTotal) {
		this.refdMontantTotal = refdMontantTotal;
	}


	



	public REFdevise(String refdCode, String refdLibellee, Float refdMontantTotal, List<Declaration> declaration) {
		super();
		this.refdCode = refdCode;
		this.refdLibellee = refdLibellee;
		this.refdMontantTotal = refdMontantTotal;
//		this.declaration = declaration;
	}


	/*public List<Declaration> getDeclaration() {
		return declaration;
	}


	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}
*/

	public REFdevise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

