package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.BanqueRepository;
import bns.tn.entities.Banque;

@Service
public class BanqueImp implements IBanque{
	@Autowired 
	private BanqueRepository banqueRepository;
	@Override
	public List<Banque> getBanques(){
		return banqueRepository.findAll();
	}
	
}
