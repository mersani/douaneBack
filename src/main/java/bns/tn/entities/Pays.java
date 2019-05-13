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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="PAYS")
@Entity
public class Pays implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="CODEALPHA_PAYS",nullable=true , length=20)
 private String pCodeAlpha;
	
@Column(name="CODENUM_PAYS",nullable=true , length=20)	
 private Long pCodeNumPays;

@Column(name="LIBELLEE_PAYS",nullable=true , length=64)
 private String pLibellee;

public String getpCodeAlpha() {
	return pCodeAlpha;
}

public void setpCodeAlpha(String pCodeAlpha) {
	this.pCodeAlpha = pCodeAlpha;
}

public Long getpCodeNumPays() {
	return pCodeNumPays;
}

public void setpCodeNumPays(Long pCodeNumPays) {
	this.pCodeNumPays = pCodeNumPays;
}

public String getpLibellee() {
	return pLibellee;
}

public void setpLibellee(String pLibellee) {
	this.pLibellee = pLibellee;
}


public Pays(String pCodeAlpha, Long pCodeNumPays, String pLibellee, Articledeclaration articledeclaration,
		List<Declaration> declaration) {
	super();
	this.pCodeAlpha = pCodeAlpha;
	this.pCodeNumPays = pCodeNumPays;
	this.pLibellee = pLibellee;

}

public Pays() {
	super();
	// TODO Auto-generated constructor stub
}

}

