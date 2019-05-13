package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IBanque;
import bns.tn.entities.Banque;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "banque", produces = "application/json")
public class BanqueController {
@Autowired
private IBanque iBanque;
@GetMapping("/all")
public @ResponseBody List<Banque> getAllBanques() {
	return iBanque.getBanques();
}
}
