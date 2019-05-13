package bns.tn.entities;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="UTILISATEUR")
public class Utilisateur implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_UTILISATEUR")
	private Long id;
	
	@Column(name="USERNAME_UTILISATEUR",nullable=true , length=64)
	private String username;
	@Column(name="PASSWORD_UTILISATEUR",nullable=true , length=64)
	private String password;
	@Column(name="NOM_UTILISATEUR",nullable=true , length=20)
	private String nom;
	@Column(name="PRENOM_UTILISATEUR",nullable=true , length=20)
	private String prenom;
	@Column(name="EMAIL_UTILISATEUR",nullable=true , length=64)
	private String email;
	@Column(name="ADRESSE_UTILISATEUR",nullable=true , length=512)
	private String adresse;
	@Column(name="TEL_UTILISATEUR",nullable=true , length=20)
	private Integer tel;
	@Column(name="CIN_UTILISATEUR",nullable=true , length=20)
	private String Cin ;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List <Role> role = new ArrayList();

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public String getCin() {
		return Cin;
	}

	public void setCin(String cin) {
		Cin = cin;
	}

	

	

	

	public Utilisateur(String username, String password, String nom, String prenom, String email, String adresse,
			Integer tel, String cin, List<Role> role) {
		super();
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
		Cin = cin;
		this.role = role;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

