package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.IntervenantRepository;
import bns.tn.entities.Intervenant;

@Service
public class IntervenantImpl implements IIntervenant{
@Autowired
IntervenantRepository intervenantRepository;
public void saveIntervenant(Intervenant intervenant) {
	intervenantRepository.save(intervenant);
}
@Override
public List<Intervenant> getIntervenants(){
	return intervenantRepository.findAll();
}

}
