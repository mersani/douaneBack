package bns.tn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="DECLARATION")


public class Declaration implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_DECLARATION" )
	   private Long decID ;
	@Column(name = "NUMERO_REPERTOIRE")
	private String decNumRep;
	@Column(name="NUMENREGISTREMENT_DECLARATION",nullable=true , length=64)
	   private String decNumEnregistrement ;
	@Column(name="DATEENREGISTREMENT_DECLARATION",nullable=true , length=64)
    private Date decDateEnregistrement;
	@Column(name="NUMLIQ_DECLARATION",nullable=true , length=64)
    private Long decNumLiquidation;
	@Column(name="DATELIQ_DECLARATION",nullable=true , length=128)
    private Date decDateLiquidation;
	@Column(name="NUMQUIT_DECLARATION",nullable=true ,length=64)
    private Long decNumQuittance ;
	@Column(name="DATEQUIT_DECLARATION",nullable=true ,length=128)
    private Date decDateQuittance ;
	@Column(name="NUMESCALE_DECLARATION",nullable=true ,length=64)
    private Long decNumEscale;
	@Column(name="DATEESCALE_DECLARATION",nullable=true ,length=128)
    private Date decDateEscale;
	@Column(name="NUMTITRETRANS_DECLARATION",nullable=true ,length=64)
    private Long decNumTitreTransport;
	@Column(name="NUMDOMICIL_DECLARATION",nullable=true ,length=64)
    private Long decNumDomiciliation;
	@Column(name="DATEDOMICIL_DECLARATION",nullable=true ,length=128)
    private Date decDateDomiciliation;
	@Column(name="PAYSORIGINE_DECLARATION",nullable=true ,length=64)
    private String decPaysOrigine;
	@Column(name="PAYSPROV_DECLARATION",nullable=true ,length=64)
    private String decPaysProvenance;
	@Column(name="PAYSDEST_DECLARATION",nullable=true ,length=64)
    private String decPaysDestinationDéfinitive;
	@Column(name="POIDSTOTBRUT_DECLARATION",nullable=true ,length=64)
    private String decPoidsTotalBrut;
	@Column(name="POIDSTOTNET_DECLARATION",nullable=true ,length=64)
    private Float decPoidsTotalNet;
	@Column(name="DEVISE_DECLARATION",nullable=true ,length=128)
    private String decDevise;
	@Column(name="TAUXDECHANGE_DEC",nullable=true ,length=64)
    private Float decTauxDeChange;
	@Column(name="VALenDOUANEenDEVISE_DEC",nullable=true ,length=128)
    private String decValeurEnDouaneEnDevise;
	@Column(name="VALLSTATENDEVISE_DEC",nullable=true ,length=128)
    private String decValeurStatistiqueEnDevise;
	@Column(name="VALSTATENMONNAIELOCAL_DEC",nullable=true ,length=128)
    private String decValeurStatistiqueSEnMonnaieLocale;
	@Column(name="MONT_total_DROI_Ttaxe",nullable=true ,length=64)
    private Float decMontantTotalDroitEtTaxe;
	@Column(name="DEVISE_FRET",nullable=true ,length=64)
    private String decDeviseFret;
	@Column(name="MONTANT_FRET",nullable=true ,length=64)
    private Float decMontantFret;
	@Column(name="DEVISE_ASSURANCE",nullable=true ,length=128)
    private String decDeviseAssurance;
	@Column(name="MONATANT_ASSURANCE",nullable=true ,length=128)
    private Float decMontantAssurance;
	@Column(name="DEVISE_GARANTIE",nullable=true ,length=128)
    private String decDeviseGarantie;
	@Column(name="DATE_GARANTIE",nullable=true ,length=128)
    private Date decDateGarantie;
	@Column(name="CONDITION_LIVRAISON",nullable=true ,length=64)
    private String decConditionslivraison;
	@Column(name="LIEU_LIVRAISON",nullable=true ,length=64)
    private String decLieuLivraison;
	@Column(name = "TRANPORT_INT")
	private String decTransInt;
	@Column(name = "TRANPORT_Front")
	private String decTransFront;
	@Column(name = "TOTALCOUTDE_CHARGE")
	private String decTotCoutCharge;
	@Column(name = "Pays_TRANSACTION")
	private String decPaysTransaction;
	@Column(name = "Pays_EXPORTATION")
	private String decPaysExportation;
	@Column(name = "UNITESUPP", nullable = true, length = 64)
	private String decUSupp;
	@Column(name = "AJUSTEMENT", nullable = true, length = 64)
	private String decAjustement;
	@Column(name = "NUMLI", nullable = true, length = 64)
	private String decNumLicence;
	@Column(name = "FOB", nullable = true, length = 64)
	private Long decFOB;
	
	 @ManyToOne
	 @JoinColumn(name="CODE_BANQUE")
	 private Banque banque ;
	
	
	@OneToMany(mappedBy = "declaration") 
	 private List<Affectation> affectation =new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="CODE_DECLARANT")
	 private Declarant dec ;
	
	
	@ManyToOne
	@JoinColumn(name="ID_AD")
	private Articledeclaration articledeclaration ;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detailstaxescode", referencedColumnName = "CODE_DT")
    private Detailstaxe detailstaxe;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Rapport", referencedColumnName = "ID_rap")
    private Rapport rapport ;
	
	
	
	public Rapport getRapport() {
		return rapport;
	}

	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delaisregcode", referencedColumnName = "CODE_DR")
    private delaisreglement delaisreglements;
	
	@ManyToOne
	@JoinColumn(name="CODE_INCOTERM")
	 private Incoterm inco ;
	
	@ManyToOne
	 @JoinColumn(name="CODE_LM")
	 private Localisationmarchandise local ;
	
	
	@ManyToOne
	@JoinColumn(name="CODE_MR")
	private Modereglement mdreg;
	
	
	@ManyToOne
	@JoinColumn(name="CODE_MDT")
	private Modetransport mdtrans ;
	
	
	
	@ManyToOne
	@JoinColumn(name="CODE_MOYENT")
	private Moyentransport mtrans;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CODE_OP", referencedColumnName = "CODE_DOUANE_OP")
    private Operateureconomique operateureconomique;
	
	@ManyToOne
	@JoinColumn(name="CODEALPHA_PAYS")
	private Pays pays ;
	
	@ManyToOne
	@JoinColumn(name="CODE_PIECESJOINTES")
	private Piecesjointes piecesjointes ;
	
	@ManyToOne
	@JoinColumn(name="CODE_REFBD")
	 private Refbureaudouane refbureaud ;
	
	
	@ManyToOne
	@JoinColumn(name="CODE_REFDEVIDSE")
	 private REFdevise refdevise ;
	
	 @ManyToOne
	 @JoinColumn(name="CODE_RD")
	 private Regimedouane rdouane ;
	

	@OneToMany(mappedBy = "declaration") 
	 private List<Typedeclaration> typedeclaration =new ArrayList<>();

	public Long getDecID() {
		return decID;
	}
	
	public void setDecID(Long decID) {
		this.decID = decID;
	}

	public String getDecNumEnregistrement() {
		return decNumEnregistrement;
	}

	public void setDecNumEnregistrement(String decNumEnregistrement) {
		this.decNumEnregistrement = decNumEnregistrement;
	}

	public Date getDecDateEnregistrement() {
		return decDateEnregistrement;
	}

	public void setDecDateEnregistrement(Date decDateEnregistrement) {
		this.decDateEnregistrement = decDateEnregistrement;
	}

	public Long getDecNumLiquidation() {
		return decNumLiquidation;
	}

	public void setDecNumLiquidation(Long decNumLiquidation) {
		this.decNumLiquidation = decNumLiquidation;
	}

	public Date getDecDateLiquidation() {
		return decDateLiquidation;
	}

	public void setDecDateLiquidation(Date decDateLiquidation) {
		this.decDateLiquidation = decDateLiquidation;
	}

	public Long getDecNumQuittance() {
		return decNumQuittance;
	}

	public void setDecNumQuittance(Long decNumQuittance) {
		this.decNumQuittance = decNumQuittance;
	}

	public Date getDecDateQuittance() {
		return decDateQuittance;
	}

	public void setDecDateQuittance(Date decDateQuittance) {
		this.decDateQuittance = decDateQuittance;
	}

	public Long getDecNumEscale() {
		return decNumEscale;
	}

	public void setDecNumEscale(Long decNumEscale) {
		this.decNumEscale = decNumEscale;
	}

	public Date getDecDateEscale() {
		return decDateEscale;
	}

	public void setDecDateEscale(Date decDateEscale) {
		this.decDateEscale = decDateEscale;
	}

	public Long getDecNumTitreTransport() {
		return decNumTitreTransport;
	}

	public void setDecNumTitreTransport(Long decNumTitreTransport) {
		this.decNumTitreTransport = decNumTitreTransport;
	}

	public Long getDecNumDomiciliation() {
		return decNumDomiciliation;
	}

	public void setDecNumDomiciliation(Long decNumDomiciliation) {
		this.decNumDomiciliation = decNumDomiciliation;
	}

	public Date getDecDateDomiciliation() {
		return decDateDomiciliation;
	}

	public void setDecDateDomiciliation(Date decDateDomiciliation) {
		this.decDateDomiciliation = decDateDomiciliation;
	}

	public String getDecPaysOrigine() {
		return decPaysOrigine;
	}

	public void setDecPaysOrigine(String decPaysOrigine) {
		this.decPaysOrigine = decPaysOrigine;
	}

	public String getDecPaysProvenance() {
		return decPaysProvenance;
	}

	public void setDecPaysProvenance(String decPaysProvenance) {
		this.decPaysProvenance = decPaysProvenance;
	}

	public String getDecPaysDestinationDéfinitive() {
		return decPaysDestinationDéfinitive;
	}

	public void setDecPaysDestinationDéfinitive(String decPaysDestinationDéfinitive) {
		this.decPaysDestinationDéfinitive = decPaysDestinationDéfinitive;
	}

	public String getDecPoidsTotalBrut() {
		return decPoidsTotalBrut;
	}

	public void setDecPoidsTotalBrut(String decPoidsTotalBrut) {
		this.decPoidsTotalBrut = decPoidsTotalBrut;
	}

	public Float getDecPoidsTotalNet() {
		return decPoidsTotalNet;
	}

	public void setDecPoidsTotalNet(Float decPoidsTotalNet) {
		this.decPoidsTotalNet = decPoidsTotalNet;
	}

	public String getDecDevise() {
		return decDevise;
	}

	public void setDecDevise(String decDevise) {
		this.decDevise = decDevise;
	}

	public Float getDecTauxDeChange() {
		return decTauxDeChange;
	}

	public void setDecTauxDeChange(Float decTauxDeChange) {
		this.decTauxDeChange = decTauxDeChange;
	}

	public String getDecValeurEnDouaneEnDevise() {
		return decValeurEnDouaneEnDevise;
	}

	public void setDecValeurEnDouaneEnDevise(String decValeurEnDouaneEnDevise) {
		this.decValeurEnDouaneEnDevise = decValeurEnDouaneEnDevise;
	}

	public String getDecValeurStatistiqueEnDevise() {
		return decValeurStatistiqueEnDevise;
	}

	public void setDecValeurStatistiqueEnDevise(String decValeurStatistiqueEnDevise) {
		this.decValeurStatistiqueEnDevise = decValeurStatistiqueEnDevise;
	}

	public String getDecValeurStatistiqueSEnMonnaieLocale() {
		return decValeurStatistiqueSEnMonnaieLocale;
	}

	public void setDecValeurStatistiqueSEnMonnaieLocale(String decValeurStatistiqueSEnMonnaieLocale) {
		this.decValeurStatistiqueSEnMonnaieLocale = decValeurStatistiqueSEnMonnaieLocale;
	}

	public Float getDecMontantTotalDroitEtTaxe() {
		return decMontantTotalDroitEtTaxe;
	}

	public void setDecMontantTotalDroitEtTaxe(Float decMontantTotalDroitEtTaxe) {
		this.decMontantTotalDroitEtTaxe = decMontantTotalDroitEtTaxe;
	}


	

	public Float getDecMontantFret() {
		return decMontantFret;
	}

	public void setDecMontantFret(Float decMontantFret) {
		this.decMontantFret = decMontantFret;
	}



	public Date getDecDateGarantie() {
		return decDateGarantie;
	}

	public void setDecDateGarantie(Date decDateGarantie) {
		this.decDateGarantie = decDateGarantie;
	}

	public String getDecConditionslivraison() {
		return decConditionslivraison;
	}

	public void setDecConditionslivraison(String decConditionslivraison) {
		this.decConditionslivraison = decConditionslivraison;
	}

	public String getDecLieuLivraison() {
		return decLieuLivraison;
	}

	public void setDecLieuLivraison(String decLieuLivraison) {
		this.decLieuLivraison = decLieuLivraison;
	}

	

	public List<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(List<Affectation> affectation) {
		this.affectation = affectation;
	}

	

	public Articledeclaration getArticledeclaration() {
		return articledeclaration;
	}

	public void setArticledeclaration(Articledeclaration articledeclaration) {
		this.articledeclaration = articledeclaration;
	}

	public Detailstaxe getDetailstaxe() {
		return detailstaxe;
	}

	public void setDetailstaxe(Detailstaxe detailstaxe) {
		this.detailstaxe = detailstaxe;
	}

	public delaisreglement getDelaisreglements() {
		return delaisreglements;
	}

	public void setDelaisreglements(delaisreglement delaisreglements) {
		this.delaisreglements = delaisreglements;
	}

	

	

	

	public Incoterm getInco() {
		return inco;
	}
	public void setInco(Incoterm inco) {
		this.inco = inco;
	}
	public Banque getBanque() {
		return banque;
	}
	public Operateureconomique getOperateureconomique() {
		return operateureconomique;
	}

	public void setOperateureconomique(Operateureconomique operateureconomique) {
		this.operateureconomique = operateureconomique;
	}

	

	public Piecesjointes getPiecesjointes() {
		return piecesjointes;
	}

	public void setPiecesjointes(Piecesjointes piecesjointes) {
		this.piecesjointes = piecesjointes;
	}

	

	
	public List<Typedeclaration> getTypedeclaration() {
		return typedeclaration;
	}

	public void setTypedeclaration(List<Typedeclaration> typedeclaration) {
		this.typedeclaration = typedeclaration;
	}

	

	public Declarant getDec() {
		return dec;
	}
	public void setDec(Declarant dec) {
		this.dec = dec;
	}
	public Localisationmarchandise getLocal() {
		return local;
	}
	public void setLocal(Localisationmarchandise local) {
		this.local = local;
	}
	public Modereglement getMdreg() {
		return mdreg;
	}
	public void setMdreg(Modereglement mdreg) {
		this.mdreg = mdreg;
	}
	public Modetransport getMdtrans() {
		return mdtrans;
	}
	public void setMdtrans(Modetransport mdtrans) {
		this.mdtrans = mdtrans;
	}
	public Moyentransport getMtrans() {
		return mtrans;
	}
	public void setMtrans(Moyentransport mtrans) {
		this.mtrans = mtrans;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	public Refbureaudouane getRefbureaud() {
		return refbureaud;
	}
	public void setRefbureaud(Refbureaudouane refbureaud) {
		this.refbureaud = refbureaud;
	}
	public REFdevise getRefdevise() {
		return refdevise;
	}
	public void setRefdevise(REFdevise refdevise) {
		this.refdevise = refdevise;
	}
	public Regimedouane getRdouane() {
		return rdouane;
	}
	public void setRdouane(Regimedouane rdouane) {
		this.rdouane = rdouane;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	

	
	public String getDecDeviseFret() {
		return decDeviseFret;
	}

	public void setDecDeviseFret(String decDeviseFret) {
		this.decDeviseFret = decDeviseFret;
	}

	public String getDecDeviseAssurance() {
		return decDeviseAssurance;
	}

	public void setDecDeviseAssurance(String decDeviseAssurance) {
		this.decDeviseAssurance = decDeviseAssurance;
	}

	public Float getDecMontantAssurance() {
		return decMontantAssurance;
	}

	public void setDecMontantAssurance(Float decMontantAssurance) {
		this.decMontantAssurance = decMontantAssurance;
	}

	public String getDecDeviseGarantie() {
		return decDeviseGarantie;
	}

	public void setDecDeviseGarantie(String decDeviseGarantie) {
		this.decDeviseGarantie = decDeviseGarantie;
	}

	
	
	public String getDecNumRep() {
		return decNumRep;
	}

	public void setDecNumRep(String decNumRep) {
		this.decNumRep = decNumRep;
	}

	public String getDecTransInt() {
		return decTransInt;
	}

	public void setDecTransInt(String decTransInt) {
		this.decTransInt = decTransInt;
	}

	public String getDecTransFront() {
		return decTransFront;
	}

	public void setDecTransFront(String decTransFront) {
		this.decTransFront = decTransFront;
	}

	public String getDecTotCoutCharge() {
		return decTotCoutCharge;
	}

	public void setDecTotCoutCharge(String decTotCoutCharge) {
		this.decTotCoutCharge = decTotCoutCharge;
	}

	public String getDecPaysTransaction() {
		return decPaysTransaction;
	}

	public void setDecPaysTransaction(String decPaysTransaction) {
		this.decPaysTransaction = decPaysTransaction;
	}

	public String getDecPaysExportation() {
		return decPaysExportation;
	}

	public void setDecPaysExportation(String decPaysExportation) {
		this.decPaysExportation = decPaysExportation;
	}

	public String getDecUSupp() {
		return decUSupp;
	}

	public void setDecUSupp(String decUSupp) {
		this.decUSupp = decUSupp;
	}

	public String getDecAjustement() {
		return decAjustement;
	}

	public void setDecAjustement(String decAjustement) {
		this.decAjustement = decAjustement;
	}

	public String getDecNumLicence() {
		return decNumLicence;
	}

	public void setDecNumLicence(String decNumLicence) {
		this.decNumLicence = decNumLicence;
	}

	public Long getDecFOB() {
		return decFOB;
	}

	public void setDecFOB(Long decFOB) {
		this.decFOB = decFOB;
	}

	public Declaration(Long decID, String decNumRep, String decNumEnregistrement, Date decDateEnregistrement,
			Long decNumLiquidation, Date decDateLiquidation, Long decNumQuittance, Date decDateQuittance,
			Long decNumEscale, Date decDateEscale, Long decNumTitreTransport, Long decNumDomiciliation,
			Date decDateDomiciliation, String decPaysOrigine, String decPaysProvenance,
			String decPaysDestinationDéfinitive, String decPoidsTotalBrut, Float decPoidsTotalNet, String decDevise,
			Float decTauxDeChange, String decValeurEnDouaneEnDevise, String decValeurStatistiqueEnDevise,
			String decValeurStatistiqueSEnMonnaieLocale, Float decMontantTotalDroitEtTaxe, String decDeviseFret,
			Float decMontantFret, String decDeviseAssurance, Float decMontantAssurance, String decDeviseGarantie,
			Date decDateGarantie, String decConditionslivraison, String decLieuLivraison, String decTransInt,
			String decTransFront, String decTotCoutCharge, String decPaysTransaction, String decPaysExportation,
			String decUSupp, String decAjustement, String decNumLicence, Long decFOB, Banque banque,
			List<Affectation> affectation, Declarant dec, Articledeclaration articledeclaration,
			Detailstaxe detailstaxe, Rapport rapport, delaisreglement delaisreglements, Incoterm inco,
			Localisationmarchandise local, Modereglement mdreg, Modetransport mdtrans, Moyentransport mtrans,
			Operateureconomique operateureconomique, Pays pays, Piecesjointes piecesjointes, Refbureaudouane refbureaud,
			REFdevise refdevise, Regimedouane rdouane, List<Typedeclaration> typedeclaration) {
		super();
		this.decID = decID;
		this.decNumRep = decNumRep;
		this.decNumEnregistrement = decNumEnregistrement;
		this.decDateEnregistrement = decDateEnregistrement;
		this.decNumLiquidation = decNumLiquidation;
		this.decDateLiquidation = decDateLiquidation;
		this.decNumQuittance = decNumQuittance;
		this.decDateQuittance = decDateQuittance;
		this.decNumEscale = decNumEscale;
		this.decDateEscale = decDateEscale;
		this.decNumTitreTransport = decNumTitreTransport;
		this.decNumDomiciliation = decNumDomiciliation;
		this.decDateDomiciliation = decDateDomiciliation;
		this.decPaysOrigine = decPaysOrigine;
		this.decPaysProvenance = decPaysProvenance;
		this.decPaysDestinationDéfinitive = decPaysDestinationDéfinitive;
		this.decPoidsTotalBrut = decPoidsTotalBrut;
		this.decPoidsTotalNet = decPoidsTotalNet;
		this.decDevise = decDevise;
		this.decTauxDeChange = decTauxDeChange;
		this.decValeurEnDouaneEnDevise = decValeurEnDouaneEnDevise;
		this.decValeurStatistiqueEnDevise = decValeurStatistiqueEnDevise;
		this.decValeurStatistiqueSEnMonnaieLocale = decValeurStatistiqueSEnMonnaieLocale;
		this.decMontantTotalDroitEtTaxe = decMontantTotalDroitEtTaxe;
		this.decDeviseFret = decDeviseFret;
		this.decMontantFret = decMontantFret;
		this.decDeviseAssurance = decDeviseAssurance;
		this.decMontantAssurance = decMontantAssurance;
		this.decDeviseGarantie = decDeviseGarantie;
		this.decDateGarantie = decDateGarantie;
		this.decConditionslivraison = decConditionslivraison;
		this.decLieuLivraison = decLieuLivraison;
		this.decTransInt = decTransInt;
		this.decTransFront = decTransFront;
		this.decTotCoutCharge = decTotCoutCharge;
		this.decPaysTransaction = decPaysTransaction;
		this.decPaysExportation = decPaysExportation;
		this.decUSupp = decUSupp;
		this.decAjustement = decAjustement;
		this.decNumLicence = decNumLicence;
		this.decFOB = decFOB;
		this.banque = banque;
		this.affectation = affectation;
		this.dec = dec;
		this.articledeclaration = articledeclaration;
		this.detailstaxe = detailstaxe;
		this.rapport = rapport;
		this.delaisreglements = delaisreglements;
		this.inco = inco;
		this.local = local;
		this.mdreg = mdreg;
		this.mdtrans = mdtrans;
		this.mtrans = mtrans;
		this.operateureconomique = operateureconomique;
		this.pays = pays;
		this.piecesjointes = piecesjointes;
		this.refbureaud = refbureaud;
		this.refdevise = refdevise;
		this.rdouane = rdouane;
		this.typedeclaration = typedeclaration;
	}

	public Declaration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 }
    
