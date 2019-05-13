package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IDevise;

import bns.tn.entities.REFdevise;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "devise", produces = "application/json")
public class DeviseController {
	@Autowired
	private IDevise idevise;

	@GetMapping("/all")
	public @ResponseBody List<REFdevise> getAllREFdevises() {
		return idevise.getREFdevises();
	}
}
