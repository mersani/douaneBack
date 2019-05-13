package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.ModereglementRepository;
import bns.tn.entities.Modereglement;

@Service
public class ModereglementImpl implements IModereglement{
@Autowired
ModereglementRepository mreglementRepository;
@Override
public List<Modereglement>getMreglements(){
	return mreglementRepository.findAll();
}
}
