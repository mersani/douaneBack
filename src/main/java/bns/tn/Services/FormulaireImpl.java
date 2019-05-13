
package bns.tn.Services;

import org.springframework.beans.factory.annotation.Autowired;

import bns.tn.DAO.ArticledeclarationRepository;
import bns.tn.DAO.DeclarantRepository;
import bns.tn.DAO.DeclarationRepository;
import bns.tn.DAO.IncotermRepository;
import bns.tn.DAO.MoyentransportRepository;
import bns.tn.DAO.OperateurRespository;
import bns.tn.DAO.PaysRepository;
import bns.tn.DAO.PiecesjointesRepository;
import bns.tn.DAO.RefbureauRepository;
import bns.tn.DAO.RefdeviseRepository;
import bns.tn.DAO.RegimedouaneRepository;
import bns.tn.DAO.TarifRepository;
import bns.tn.DAO.TransactionRepository;
import bns.tn.DAO.TypedeclarationRepository;
import bns.tn.DAO.UtilisateurRepository;
import bns.tn.entities.Articledeclaration;
import bns.tn.entities.Declarant;
import bns.tn.entities.Declaration;
import bns.tn.entities.Formulaire;
import bns.tn.entities.Incoterm;
import bns.tn.entities.Moyentransport;
import bns.tn.entities.Operateureconomique;
import bns.tn.entities.Pays;
import bns.tn.entities.Piecesjointes;
import bns.tn.entities.REFdevise;
import bns.tn.entities.Regimedouane;
import bns.tn.entities.Tarif;
import bns.tn.entities.Transaction;
import bns.tn.entities.Typedeclaration;
import bns.tn.entities.Utilisateur;
import org.springframework.stereotype.Service;


@Service
public class FormulaireImpl implements IFormulaire{
	 @Autowired
	 UtilisateurRepository utilisateurRepository ;
	 @Autowired
	 DeclarationRepository declarationRepository;
	 @Autowired
	 OperateurRespository operateurRespository;
	 @Autowired
	 DeclarantRepository declarantRepository;
	 @Autowired
	 IncotermRepository incotermRepository;
	 @Autowired
	 MoyentransportRepository moyentransportRepository;
	 @Autowired
	 RefdeviseRepository refdeviseRepository;
	 @Autowired
	 PiecesjointesRepository piecesjointesRepository;
	 @Autowired
	 RefbureauRepository refbureauRepository;
	 @Autowired
	 PaysRepository paysRepository;
	 @Autowired
	 TarifRepository tarifRepository;
	 @Autowired
	 TransactionRepository transactionRepository;
	 @Autowired
	 TypedeclarationRepository typedeclarationRepository;
	 @Autowired
	 RegimedouaneRepository regimedRepository;
	 @Autowired
	 ArticledeclarationRepository articleRepository;
	 @Override 
	 
	 public void saveFormulaire (Formulaire formulaire) {
		 Declaration dec =new Declaration();
		 dec.setDecNumEscale(formulaire.getDecNumEscale());
		 dec.setDecDateEscale(formulaire.getDecDateEscale());
		 dec.setDecID(formulaire.getDecID());
		 dec.setDecNumRep(formulaire.getDecNumRep());
		 dec.setDecPaysTransaction(formulaire.getDecPaysTransaction());
		 dec.setDecDateEnregistrement(formulaire.getDecDateEnregistrement());
		 dec.setDecTotCoutCharge(formulaire.getDecTotCoutCharge());
		 dec.setDecPaysExportation(formulaire.getDecPaysExportation());
		 dec.setDecUSupp(formulaire.getDecUSupp());
		 dec.setDecAjustement(formulaire.getDecAjustement());
		 dec.setDecFOB(formulaire.getDecFOB());
		 dec.setDecNumLicence(formulaire.getDecNumLicence());
		 dec.setDecPaysOrigine(formulaire.getDecPaysOrigine());
		 dec.setDecPaysDestinationDéfinitive(formulaire.getDecPaysDestinationDéfinitive());
		 dec.setDecTauxDeChange(formulaire.getDecTauxDeChange());
		 dec.setDecPoidsTotalBrut(formulaire.getDecPoidsTotalBrut());
		 dec.setDecPoidsTotalNet(formulaire.getDecPoidsTotalNet());
		 dec.setDecMontantAssurance(formulaire.getDecMontantAssurance());
		 dec.setDecMontantFret(formulaire.getDecMontantFret());
		 declarationRepository.save(dec);
		 
		 Typedeclaration td= new Typedeclaration();
		 td.setTypedecLibellee(formulaire.getTypedecLibellee());
		 typedeclarationRepository.save(td);
		 
		 Articledeclaration ad= new Articledeclaration();
		 ad.setAdNbrArticle(formulaire.getAdNbrArticle());
		 ad.setAdNbrcolis(formulaire.getAdNbrcolis());
		 ad.setAdNaturecolis(formulaire.getAdNaturecolis());
		 ad.setAdNumcolis(formulaire.getAdNumcolis());
		 ad.setAdNMarchandise(formulaire.getAdNMarchandise());
		 ad.setAdQuantiteDouane(formulaire.getAdQuantiteDouane());
		 ad.setAdPrixArticle(formulaire.getAdPrixArticle());
		 ad.setAdNumConteneur(formulaire.getAdNumConteneur());
		 articleRepository.save(ad);
		 
		 Operateureconomique op = new Operateureconomique();
		 op.setOpAdresse(formulaire.getAdresse());
		 op.setOpMF(formulaire.getOpMF());
		 op.setOpRS(formulaire.getOpRS());
		 op.setOpPrenom(formulaire.getOpPrenom());
		 op.setOpNom(formulaire.getOpNom());
		 op.setOpTel(formulaire.getOpTel());
		 operateurRespository.save(op);
		 
		 Utilisateur ut =new Utilisateur();
		 ut.setEmail(formulaire.getEmail());
		 ut.setNom(formulaire.getNom());
		 ut.setAdresse(formulaire.getAdresse());
		 ut.setPrenom(formulaire.getPrenom());
		 ut.setTel(formulaire.getTel());
		 utilisateurRepository.save(ut);
		 
		 Declarant decl = new Declarant();
		 decl.setDeclCode(formulaire.getDeclCode());
		 decl.setDeclNumagrement(formulaire.getDeclNumagrement());
		 decl.setDeclRaisonSocial(formulaire.getDeclRaisonSocial());
		 declarantRepository.save(decl);
		 
		 Regimedouane rd = new Regimedouane();
		 rd.setRdCode(formulaire.getRdCode());
		 rd.setRdCodeadd(formulaire.getRdCodeadd());
		 regimedRepository.save(rd);
		 
		 Pays ps = new Pays();
		 ps.setpCodeAlpha(formulaire.getpCodeAlpha());
		 paysRepository.save(ps);
		 
		 Incoterm in = new Incoterm();
		 in.setIncCodesSupp(formulaire.getIncCodesSupp());
		 in.setIncCode(formulaire.getIncCode());
	     incotermRepository.save(in);
	     
		 Moyentransport mt = new Moyentransport();
		 mt.setMoyentCode(formulaire.getMoyentCode());
		 mt.setMoyentNationnalite(formulaire.getMoyentNationnalite());
		 moyentransportRepository.save(mt);
		 
		 REFdevise red = new REFdevise();
		 red.setRefdCode(formulaire.getRefdCode());
		 red.setRefdMontantTotal(formulaire.getRefdMontantTotal());
		 refdeviseRepository.save(red);
		 
		 Piecesjointes pj=new Piecesjointes();
		 pj.setPJNomPiecesJointes(formulaire.getPJNomPiecesJointes());
		 pj.setPjType(formulaire.getPjType());
		 piecesjointesRepository.save(pj);
		 
		 Tarif t=new Tarif();
		 t.settCodeTarif(formulaire.gettCodeTarif());
		 tarifRepository.save(t);
		 
		 Transaction tr=new Transaction();
		 tr.setTransCodeN(formulaire.getTransCodeN());
		 transactionRepository.save(tr);
		 
		 
	 }
	 
}