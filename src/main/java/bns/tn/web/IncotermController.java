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

import bns.tn.Services.IIncoterm;
import bns.tn.entities.Incoterm;

/*@CrossOrigin(origins = "http://localhost:4200")
*/
@CrossOrigin("*")
@RestController
@RequestMapping(value = "incoterm", produces = "application/json")
public class IncotermController {
	@Autowired
	private IIncoterm iIncoterm;

	@PostMapping("/save")
	public void saveIncoterm(@RequestBody Incoterm incoterm) {
		iIncoterm.saveIncoterm(incoterm);
	}

	@GetMapping("/all")
	public @ResponseBody List<Incoterm> getAllIncoterms() {
		return iIncoterm.getIncoterms();
	}
}
