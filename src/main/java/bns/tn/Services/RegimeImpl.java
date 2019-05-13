package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RegimedouaneRepository;
import bns.tn.entities.Regimedouane;

@Service
public class RegimeImpl implements IRegime{
@Autowired
RegimedouaneRepository regimedouaneRepository;
@Override
public List<Regimedouane>getRegimes(){
	return regimedouaneRepository.findAll();
}
}
