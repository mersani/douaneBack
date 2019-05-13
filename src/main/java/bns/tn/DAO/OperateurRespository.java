package bns.tn.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Operateureconomique;
public interface OperateurRespository extends JpaRepository<Operateureconomique,Long> {
	public Operateureconomique findByOpCodeD (String opCodeD);

}
