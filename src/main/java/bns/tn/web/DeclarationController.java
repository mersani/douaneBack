package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IDeclaration;
import bns.tn.entities.Declaration;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "declaration", produces = "application/json")
public class DeclarationController {
	@Autowired
	private IDeclaration iDeclaration;

	@PostMapping("/save")
	public void saveDeclaration(@RequestBody Declaration declaration) {
		iDeclaration.saveDeclaration(declaration);

	}

	@GetMapping("/all")
	public @ResponseBody List<Declaration> getAllDeclarations() {
		return iDeclaration.getDeclarations();
	}

	@PostMapping("/declaration/{decID}")
	public void putdeclaration(@PathVariable(name = "decID") Long decID, @RequestBody Declaration declaration) {
		iDeclaration.updateDeclaration(declaration, decID);

	}

	@DeleteMapping("/delete-by-id/{decID}")
	public void deletedeclaration(@PathVariable(name = "DecID") Long decID) {
		iDeclaration.deleteDeclaration(decID);
	}

	@GetMapping("/one/{decID}")
	public @ResponseBody Declaration getOnedec(@PathVariable(name = "decID") Long decID, Declaration declaration) {
		return iDeclaration.getOnedec(decID);
	}
}