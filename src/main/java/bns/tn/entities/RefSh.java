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

@Table(name="REFSH")
@Entity

public class RefSh implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_REFSH")
private Long refshCode;
	@Column(name="LIBELLEE_REFSH",nullable=true , length=64)
private String refshLibellee ;

	@ManyToOne
    @JoinColumn(name="ID_AD")
    private Articledeclaration articledeclaration ;
    
    @ManyToOne
    @JoinColumn(name="CODE_TARIF")
    private Tarif tarif ;

	public Long getRefshCode() {
		return refshCode;
	}

	public void setRefshCode(Long refshCode) {
		this.refshCode = refshCode;
	}

	public String getRefshLibellee() {
		return refshLibellee;
	}

	public void setRefshLibellee(String refshLibellee) {
		this.refshLibellee = refshLibellee;
	}

	public Articledeclaration getArticledeclaration() {
		return articledeclaration;
	}

	public void setArticledeclaration(Articledeclaration articledeclaration) {
		this.articledeclaration = articledeclaration;
	}

	public Tarif getTarif() {
		return tarif;
	}

	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}

	public RefSh(String refshLibellee, Articledeclaration articledeclaration, Tarif tarif) {
		super();
		this.refshLibellee = refshLibellee;
		this.articledeclaration = articledeclaration;
		this.tarif = tarif;
	}

	public RefSh() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
