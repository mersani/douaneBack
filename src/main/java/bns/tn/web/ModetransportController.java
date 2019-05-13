package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.Imodetransport;
import bns.tn.entities.Modetransport;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "transport" , produces="application/json")
public class ModetransportController {
@Autowired
private Imodetransport imodetransport;
@GetMapping("/all")
public @ResponseBody List<Modetransport>getAllmodetransports(){
	return imodetransport.getmodetransports();
}
}
