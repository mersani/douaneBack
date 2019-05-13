package bns.tn.DAO;

import bns.tn.entities.Declarant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclarantRepository extends JpaRepository<Declarant, Long>{
	public Declarant findByDeclCode(String declCode);
}
