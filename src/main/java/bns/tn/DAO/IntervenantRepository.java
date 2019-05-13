package bns.tn.DAO;

import bns.tn.entities.Intervenant;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IntervenantRepository extends JpaRepository<Intervenant,Long>{
 public Intervenant findByUsername(String username);
}

