package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="REFTAXE")
@Entity
public class REFTaxe implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_REFTAXE")
    private Long reftCode;
    @Column(name="LIBELLEE_REFTAXE",nullable=true , length=20)
    private String reftLibelle;
    @Column(name="OBSERVATION_REFTAXE",nullable=true , length=20)
    private String reftObservation;
    
    @OneToMany(mappedBy = "reftaxe")
	private List<Detailstaxe> detailstaxe =new ArrayList<>();
    
    @OneToMany(mappedBy = "reftaxe") 
	 private List<Typereftaxe> typereftaxe =new ArrayList<>();

	public Long getReftCode() {
		return reftCode;
	}

	public void setReftCode(Long reftCode) {
		this.reftCode = reftCode;
	}

	public String getReftLibelle() {
		return reftLibelle;
	}

	public void setReftLibelle(String reftLibelle) {
		this.reftLibelle = reftLibelle;
	}

	public String getReftObservation() {
		return reftObservation;
	}

	public void setReftObservation(String reftObservation) {
		this.reftObservation = reftObservation;
	}

	public List<Detailstaxe> getDetailstaxe() {
		return detailstaxe;
	}

	public void setDetailstaxe(List<Detailstaxe> detailstaxe) {
		this.detailstaxe = detailstaxe;
	}

	public List<Typereftaxe> getTypereftaxe() {
		return typereftaxe;
	}

	public void setTypereftaxe(List<Typereftaxe> typereftaxe) {
		this.typereftaxe = typereftaxe;
	}

	public REFTaxe(String reftLibelle, String reftObservation, List<Detailstaxe> detailstaxe,
			List<Typereftaxe> typereftaxe) {
		super();
		this.reftLibelle = reftLibelle;
		this.reftObservation = reftObservation;
		this.detailstaxe = detailstaxe;
		this.typereftaxe = typereftaxe;
	}

	public REFTaxe() {
		super();
		// TODO Auto-generated constructor stub
	}

}

