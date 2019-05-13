package bns.tn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import bns.tn.Services.IFormulaire;
import bns.tn.entities.Formulaire;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "form", produces = "application/json")
public class FormulaireController {
	@Autowired
	private IFormulaire iFormulaire ;
	@PostMapping("/save")
	public void saveFormulaire(@RequestBody Formulaire formulaire) {
  iFormulaire.saveFormulaire(formulaire);
}
}