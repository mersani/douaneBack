package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RefbureauRepository;
import bns.tn.entities.Refbureaudouane;

@Service
public class RefbureauImpl implements IRefbureau {
@Autowired
RefbureauRepository refbureauRepository;
@Override
public List<Refbureaudouane> getBurs(){
	return refbureauRepository.findAll();
}
}
