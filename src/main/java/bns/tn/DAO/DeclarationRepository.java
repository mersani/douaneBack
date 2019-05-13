package bns.tn.DAO;

import bns.tn.entities.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DeclarationRepository extends JpaRepository<Declaration,Long> {
	public Declaration findByDecID(Long decID);}
