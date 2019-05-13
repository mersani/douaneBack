
package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import bns.tn.entities.Piecesjointes;

public interface PiecesjointesRepository extends JpaRepository<Piecesjointes, Long>{
 public Piecesjointes findByPjCode (Long pjCode);
}