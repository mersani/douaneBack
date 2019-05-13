package bns.tn.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IRapport;
import bns.tn.entities.Rapport;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "rapport", produces = "application/json")
public class RapportContoller {
	@Autowired
	private IRapport irapport;

	@PostMapping("/save")
	public void saveRapport(@RequestBody Rapport rapport) {
		irapport.saveRapport(rapport);
	}

	@GetMapping("/all")
	public @ResponseBody List<Rapport> getAllRapports() {
		return irapport.getRapports();
	}

	@DeleteMapping("/delete/{rapId}")
	public void deleteRapport(@PathVariable(name = "rapId") Long rapId) {
		irapport.deleteRapport(rapId);
	}
	
	@PutMapping("/update/{rapId}")
	public void putrapport(@PathVariable(name = "rapId") Long rapId, @RequestBody Rapport rapport) {
		irapport.updateRapport(rapport, rapId);
		
	}

	@GetMapping("/one/{rapId}")
	public @ResponseBody Rapport getOnrap(@PathVariable(name = "rapId") Long rapId, Rapport rapport) {
		return irapport.getOnerap(rapId);
	}
	
}
