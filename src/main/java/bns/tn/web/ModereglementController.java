package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IModereglement;
import bns.tn.entities.Modereglement;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "reglement" , produces="application/json")
public class ModereglementController {
	@Autowired
	private IModereglement iModereglement;
	@GetMapping("/all")
	public @ResponseBody List<Modereglement>getAllMreglements(){return iModereglement.getMreglements();

}
}