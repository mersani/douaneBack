package bns.tn.DAO;
 
import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Articledeclaration;

public interface ArticledeclarationRepository extends JpaRepository<Articledeclaration,Long>{
public Articledeclaration findByAdId (Long adId);
}
