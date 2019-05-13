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

@Table(name = "REF_BUREAU_DOUANE")
@Entity
public class Refbureaudouane implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODE_REFBD")
	private String bdCode;
	@Column(name = "LIBELLEE_REFBD", nullable = true, length = 64)
	private String bdLibellee;

	@OneToMany(mappedBy = "refbureaud")
	private List<Declaration> declaration = new ArrayList<>();

	public String getBdCode() {
		return bdCode;
	}

	public void setBdCode(String bdCode) {
		this.bdCode = bdCode;
	}

	public String getBdLibellee() {
		return bdLibellee;
	}

	public void setBdLibellee(String bdLibellee) {
		this.bdLibellee = bdLibellee;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public Refbureaudouane(String bdCode, String bdLibellee, List<Declaration> declaration) {
		super();
		this.bdCode = bdCode;
		this.bdLibellee = bdLibellee;
		this.declaration = declaration;
	}

	public Refbureaudouane() {
		super();
		// TODO Auto-generated constructor stub
	}

}