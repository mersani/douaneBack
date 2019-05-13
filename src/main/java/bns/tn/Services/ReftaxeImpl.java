package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.REFTaxeRepository;
import bns.tn.entities.REFTaxe;

@Service
public class ReftaxeImpl implements IReftaxe {
	@Autowired
	REFTaxeRepository reftaxeRepository;
	@Override
	public List<REFTaxe> getTaxes(){
		return reftaxeRepository.findAll();
	}

}
