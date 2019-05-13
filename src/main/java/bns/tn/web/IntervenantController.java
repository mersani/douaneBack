package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IIntervenant;

import bns.tn.entities.Intervenant;

/*@CrossOrigin(origins = "http://localhost:4200")
*/
@CrossOrigin("*")
@RestController
@RequestMapping(value = "Intervenant" , produces="application/json")
public class IntervenantController {
	@Autowired
	private IIntervenant iIntervenant ;
	 @PostMapping("/save")
	 public void saveIntervenant(@RequestBody Intervenant intervenant) {
		 iIntervenant.saveIntervenant(intervenant);}
	 @GetMapping("/all")
	 public @ResponseBody List<Intervenant>getAllIntervenants(){return iIntervenant.getIntervenants();

}
}
