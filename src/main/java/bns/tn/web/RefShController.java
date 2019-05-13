package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IRefsh;
import bns.tn.entities.RefSh;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "Sh", produces = "application/json")
public class RefShController {
	@Autowired
	private IRefsh irefsh;

	@GetMapping("/all")
	public @ResponseBody List<RefSh> getAllShs() {
		return irefsh.getShs();
	}
}
