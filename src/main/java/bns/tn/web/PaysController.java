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

import bns.tn.Services.IPays;
import bns.tn.entities.Pays;

/*@CrossOrigin(origins = "http://localhost:4200")
*/
@CrossOrigin("*")
@RestController
@RequestMapping(value = "pays", produces = "application/json")
public class PaysController {
	@Autowired
	private IPays ipays;

	@PostMapping("/save")
	public void savePays(@RequestBody Pays pays) {
		ipays.savePays(pays);
	}

	@GetMapping("/all")
	public @ResponseBody List<Pays> getAllPayss() {
		return ipays.getPayss();
	}
}
