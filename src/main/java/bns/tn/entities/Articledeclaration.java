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
@Table (name="Article")
@Entity

public class Articledeclaration implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_AD")
	private Long adId ;
	@Column(name="Numero_AD",nullable=true , length=64)
	private Long adNumArticle;
	@Column(name="LIBELLE_AD",nullable=true , length=64)
	private String adLibelle;
	@Column(name="MARQUE_AD",nullable=true , length=64)
    private String adMarque;
	@Column(name="NUMERO_COLIS",nullable=true , length=64)
	private String adNumcolis;
	@Column(name="NBR_COLIS",nullable=true , length=64)
	private Long adNbrcolis;
	@Column(name="NATURE_COLIS",nullable=true , length=64)
	private String adNaturecolis;
	@Column(name="POIDS_BRUT",nullable=true , length=64)
	private Float adPoidsbrut;
	@Column(name="POIDS_NET",nullable=true , length=64)
	private Float adPoidsnet;
	@Column(name="VAL_en_DOUANE_DEVISE",nullable=true , length=64)
	private Float adValeurEndouaneenDevise;
	@Column(name="VAL_EN_D_ML",nullable=true , length=64)
	private Float adValeurEnDouaneMonnaieLocale;
	@Column(name="VAL_STAT_EN_DEVISE",nullable=true , length=64)
	private Float adValeurStatistiqueEnDevise;
	@Column(name="VAL_STAT_EN_ML",nullable=true , length=64)
	private Float adValeurStatistiqueEnMonnaielocale;
	@Column(name="NUM_CONTENEUR",nullable=true , length=64)
	private Long adNumConteneur;
	  @Column (name="NBR-ARTICLE")
	    private Long adNbrArticle;
	    @Column(name="NatureMARCHANDISES",nullable=true , length=64)
		private String adNMarchandise;
	    @Column(name="PRIX_ARTICLE",nullable=true , length=64)
		private String adPrixArticle;
	    @Column(name="QUANTITE",nullable=true , length=64)
		private String adQuantiteDouane;
	@OneToMany(mappedBy = "articledeclaration") 
	 private List<Declaration> declaration =new ArrayList<>();

	@OneToMany(mappedBy = "articledeclaration") 
	 private List<RefSh> refsh =new ArrayList<>();

	public Long getAdId() {
		return adId;
	}

	public void setAdId(Long adId) {
		this.adId = adId;
	}

	public Long getAdNumArticle() {
		return adNumArticle;
	}

	public void setAdNumArticle(Long adNumArticle) {
		this.adNumArticle = adNumArticle;
	}

	public String getAdLibelle() {
		return adLibelle;
	}

	public void setAdLibelle(String adLibelle) {
		this.adLibelle = adLibelle;
	}

	public String getAdMarque() {
		return adMarque;
	}

	public void setAdMarque(String adMarque) {
		this.adMarque = adMarque;
	}

	public String getAdNumcolis() {
		return adNumcolis;
	}

	public void setAdNumcolis(String adNumcolis) {
		this.adNumcolis = adNumcolis;
	}

	public Long getAdNbrcolis() {
		return adNbrcolis;
	}

	public void setAdNbrcolis(Long adNbrcolis) {
		this.adNbrcolis = adNbrcolis;
	}

	public String getAdNaturecolis() {
		return adNaturecolis;
	}

	public void setAdNaturecolis(String adNaturecolis) {
		this.adNaturecolis = adNaturecolis;
	}

	public Float getAdPoidsbrut() {
		return adPoidsbrut;
	}

	public void setAdPoidsbrut(Float adPoidsbrut) {
		this.adPoidsbrut = adPoidsbrut;
	}

	public Float getAdPoidsnet() {
		return adPoidsnet;
	}

	public void setAdPoidsnet(Float adPoidsnet) {
		this.adPoidsnet = adPoidsnet;
	}

	public Float getAdValeurEndouaneenDevise() {
		return adValeurEndouaneenDevise;
	}

	public void setAdValeurEndouaneenDevise(Float adValeurEndouaneenDevise) {
		this.adValeurEndouaneenDevise = adValeurEndouaneenDevise;
	}

	public Float getAdValeurEnDouaneMonnaieLocale() {
		return adValeurEnDouaneMonnaieLocale;
	}

	public void setAdValeurEnDouaneMonnaieLocale(Float adValeurEnDouaneMonnaieLocale) {
		this.adValeurEnDouaneMonnaieLocale = adValeurEnDouaneMonnaieLocale;
	}

	public Float getAdValeurStatistiqueEnDevise() {
		return adValeurStatistiqueEnDevise;
	}

	public void setAdValeurStatistiqueEnDevise(Float adValeurStatistiqueEnDevise) {
		this.adValeurStatistiqueEnDevise = adValeurStatistiqueEnDevise;
	}

	public Float getAdValeurStatistiqueEnMonnaielocale() {
		return adValeurStatistiqueEnMonnaielocale;
	}

	public void setAdValeurStatistiqueEnMonnaielocale(Float adValeurStatistiqueEnMonnaielocale) {
		this.adValeurStatistiqueEnMonnaielocale = adValeurStatistiqueEnMonnaielocale;
	}

	public Long getAdNumConteneur() {
		return adNumConteneur;
	}

	public void setAdNumConteneur(Long adNumConteneur) {
		this.adNumConteneur = adNumConteneur;
	}

	public List<Declaration> getDeclaration() {
		return declaration;
	}

	public void setDeclaration(List<Declaration> declaration) {
		this.declaration = declaration;
	}

	public List<RefSh> getRefsh() {
		return refsh;
	}

	public void setRefsh(List<RefSh> refsh) {
		this.refsh = refsh;
	}

	public Articledeclaration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAdNbrArticle() {
		return adNbrArticle;
	}

	public void setAdNbrArticle(Long adNbrArticle) {
		this.adNbrArticle = adNbrArticle;
	}

	public String getAdNMarchandise() {
		return adNMarchandise;
	}

	public void setAdNMarchandise(String adNMarchandise) {
		this.adNMarchandise = adNMarchandise;
	}

	public String getAdPrixArticle() {
		return adPrixArticle;
	}

	public void setAdPrixArticle(String adPrixArticle) {
		this.adPrixArticle = adPrixArticle;
	}

	public String getAdQuantiteDouane() {
		return adQuantiteDouane;
	}

	public void setAdQuantiteDouane(String adQuantiteDouane) {
		this.adQuantiteDouane = adQuantiteDouane;
	}

	public Articledeclaration(Long adId, Long adNumArticle, String adLibelle, String adMarque, String adNumcolis,
			Long adNbrcolis, String adNaturecolis, Float adPoidsbrut, Float adPoidsnet, Float adValeurEndouaneenDevise,
			Float adValeurEnDouaneMonnaieLocale, Float adValeurStatistiqueEnDevise,
			Float adValeurStatistiqueEnMonnaielocale, Long adNumConteneur, Long adNbrArticle, String adNMarchandise,
			String adPrixArticle, String adQuantiteDouane, List<Declaration> declaration, List<Pays> pays,
			List<RefSh> refsh) {
		super();
		this.adId = adId;
		this.adNumArticle = adNumArticle;
		this.adLibelle = adLibelle;
		this.adMarque = adMarque;
		this.adNumcolis = adNumcolis;
		this.adNbrcolis = adNbrcolis;
		this.adNaturecolis = adNaturecolis;
		this.adPoidsbrut = adPoidsbrut;
		this.adPoidsnet = adPoidsnet;
		this.adValeurEndouaneenDevise = adValeurEndouaneenDevise;
		this.adValeurEnDouaneMonnaieLocale = adValeurEnDouaneMonnaieLocale;
		this.adValeurStatistiqueEnDevise = adValeurStatistiqueEnDevise;
		this.adValeurStatistiqueEnMonnaielocale = adValeurStatistiqueEnMonnaielocale;
		this.adNumConteneur = adNumConteneur;
		this.adNbrArticle = adNbrArticle;
		this.adNMarchandise = adNMarchandise;
		this.adPrixArticle = adPrixArticle;
		this.adQuantiteDouane = adQuantiteDouane;
		this.declaration = declaration;
		this.refsh = refsh;
	}


	
}

