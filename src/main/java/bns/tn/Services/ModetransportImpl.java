package bns.tn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.ModetransportRepository;
import bns.tn.entities.Modetransport;

@Service
public class ModetransportImpl implements Imodetransport{
@Autowired
ModetransportRepository mtransportRepository;
@Override
public List<Modetransport> getmodetransports(){
	return mtransportRepository.findAll();
}

}
