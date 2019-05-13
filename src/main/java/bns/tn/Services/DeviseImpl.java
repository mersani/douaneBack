package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RefdeviseRepository;
import bns.tn.entities.REFdevise;

@Service
public class DeviseImpl implements IDevise {
	@Autowired
	RefdeviseRepository refdeviseRepository;
	@Override
	public List<REFdevise>getREFdevises(){
		return refdeviseRepository.findAll();
	}

}
