package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IRefbureau;
import bns.tn.entities.Refbureaudouane;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "bureau" , produces="application/json")
public class RefbureauController {
@Autowired
private IRefbureau iRefbureau ;
@GetMapping ("/all")
public @ResponseBody List<Refbureaudouane>getAllBurs()
{return iRefbureau.getBurs();
}
}