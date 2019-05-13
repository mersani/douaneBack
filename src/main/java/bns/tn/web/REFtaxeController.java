package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IRefsh;
import bns.tn.Services.IReftaxe;
import bns.tn.entities.REFTaxe;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "reftaxe", produces = "application/json")
public class REFtaxeController {
@Autowired
private IReftaxe ireftaxe;
@GetMapping("/all")
public @ResponseBody List<REFTaxe>getAllTaxes(){
	return ireftaxe.getTaxes();
}
}
