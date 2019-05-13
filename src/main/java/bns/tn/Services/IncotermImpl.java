package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.IncotermRepository;
import bns.tn.entities.Incoterm;

@Service
public class IncotermImpl implements IIncoterm {
@Autowired
IncotermRepository incotermRepository;
public void saveIncoterm(Incoterm incoterm) {
	incotermRepository.save(incoterm);
}
@Override
 public List<Incoterm> getIncoterms(){ return incotermRepository.findAll();
}
}