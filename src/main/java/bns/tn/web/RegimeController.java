package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IRegime;
import bns.tn.entities.Regimedouane;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "regime" , produces="application/json")
public class RegimeController {
	@Autowired
	private IRegime iregime;
@GetMapping("/all")
public @ResponseBody List<Regimedouane>getAllRegimes(){
	return iregime.getRegimes();

}
}