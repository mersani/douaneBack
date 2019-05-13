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

@Table (name="TYPEMOYEN")
@Entity

public class Typemoyentransport implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_TYPEMOYEN")
	private String typemoyCode ;
	@Column(name="LIBELLEE_TYPMOYEN",nullable= true , length=64)
	private String typemoyLibellee ;
	
	@ManyToOne
	 @JoinColumn(name="CODE_MOYENT")
	 private Moyentransport moyentransport ;

	public String getTypemoyCode() {
		return typemoyCode;
	}

	public void setTypemoyCode(String typemoyCode) {
		this.typemoyCode = typemoyCode;
	}

	public String getTypemoyLibellee() {
		return typemoyLibellee;
	}

	public void setTypemoyLibellee(String typemoyLibellee) {
		this.typemoyLibellee = typemoyLibellee;
	}

	public Moyentransport getMoyentransport() {
		return moyentransport;
	}

	public void setMoyentransport(Moyentransport moyentransport) {
		this.moyentransport = moyentransport;
	}

	public Typemoyentransport(String typemoyLibellee, Moyentransport moyentransport) {
		super();
		this.typemoyLibellee = typemoyLibellee;
		this.moyentransport = moyentransport;
	}

	public Typemoyentransport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

