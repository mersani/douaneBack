package bns.tn.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Typepiecesjointes;
public interface PjtypeRepository extends JpaRepository<Typepiecesjointes, Long>{
 public Typepiecesjointes findByPjtCode (Long pjtCode);
}
