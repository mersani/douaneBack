package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.PaysRepository;
import bns.tn.entities.Pays;

@Service
public class PaysImpl implements IPays{
@Autowired
PaysRepository paysRepository;
public void savePays(Pays pays) {
	paysRepository.save(pays);
	
}
@Override
public List<Pays> getPayss(){
	return paysRepository.findAll();
}
}
