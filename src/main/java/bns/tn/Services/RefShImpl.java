package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.RefshRepository;
import bns.tn.entities.RefSh;

@Service
public class RefShImpl implements IRefsh {
	@Autowired
	RefshRepository refshRepository;

	@Override
	public List<RefSh> getShs() {
		return refshRepository.findAll();
	}

}
