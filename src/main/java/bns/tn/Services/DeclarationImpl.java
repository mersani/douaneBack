package bns.tn.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.DeclarationRepository;

import bns.tn.entities.Declaration;

@Service
public class DeclarationImpl implements IDeclaration {

	@Autowired

	private DeclarationRepository declarationRepository;

	public void saveDeclaration(Declaration declaration) {
		declarationRepository.save(declaration);
	}

	@Override
	public List<Declaration> getDeclarations() {
		return declarationRepository.findAll();
	}

	@Override
	public void updateDeclaration(Declaration declaration, Long decID) {
		Optional<Declaration> dec = declarationRepository.findById(decID);
		if (dec.isPresent()) {
			Declaration decl = dec.get();
			decl.setDecConditionslivraison(declaration.getDecConditionslivraison());
			decl.setDecDateDomiciliation(declaration.getDecDateDomiciliation());
			decl.setDecDateEnregistrement(declaration.getDecDateEnregistrement());
			decl.setDecDateEscale(declaration.getDecDateEscale());
			decl.setDecDateGarantie(declaration.getDecDateGarantie());
			decl.setDecDateLiquidation(declaration.getDecDateLiquidation());
			decl.setDecDateQuittance(declaration.getDecDateQuittance());
			decl.setDecDevise(declaration.getDecDevise());
			decl.setDecDeviseAssurance(declaration.getDecDeviseAssurance());
			decl.setDecDeviseFret(declaration.getDecDeviseFret());
			decl.setDecDeviseGarantie(declaration.getDecDeviseGarantie());
			decl.setDecLieuLivraison(declaration.getDecLieuLivraison());
			decl.setDecMontantAssurance(declaration.getDecMontantAssurance());
			decl.setDecMontantFret(declaration.getDecMontantFret());
			decl.setDecMontantTotalDroitEtTaxe(declaration.getDecMontantTotalDroitEtTaxe());
			decl.setDecNumDomiciliation(declaration.getDecNumDomiciliation());
			decl.setDecNumEnregistrement(declaration.getDecNumEnregistrement());
			decl.setDecNumEscale(declaration.getDecNumEscale());
			decl.setDecNumLiquidation(declaration.getDecNumLiquidation());
			decl.setDecNumQuittance(declaration.getDecNumQuittance());
			decl.setDecNumTitreTransport(declaration.getDecNumTitreTransport());
			decl.setDecPaysDestinationDéfinitive(declaration.getDecPaysDestinationDéfinitive());
			decl.setDecPaysOrigine(declaration.getDecPaysOrigine());
			decl.setDecPaysProvenance(declaration.getDecPaysProvenance());
			decl.setDecPoidsTotalBrut(declaration.getDecPoidsTotalBrut());
			decl.setDecPoidsTotalNet(declaration.getDecPoidsTotalNet());
			decl.setDecTauxDeChange(declaration.getDecTauxDeChange());
			decl.setDecValeurEnDouaneEnDevise(declaration.getDecValeurEnDouaneEnDevise());
			decl.setDecValeurStatistiqueEnDevise(declaration.getDecValeurStatistiqueEnDevise());
			decl.setDecValeurStatistiqueSEnMonnaieLocale(declaration.getDecValeurStatistiqueSEnMonnaieLocale());
			decl.setDelaisreglements(declaration.getDelaisreglements());
			decl.setTypedeclaration(declaration.getTypedeclaration());

			declarationRepository.saveAndFlush(decl);

		}
	}

	@Override
	public void deleteDeclaration(Long decID) {
		declarationRepository.deleteById(decID);

	}

	@Override
	public Declaration getOnedec(Long decID) {
		Declaration obj = declarationRepository.findById(decID).get();
		return obj;
	}
}
