package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Regimedouane;

public interface RegimedouaneRepository extends JpaRepository<Regimedouane, Long>{
public Regimedouane findByRdCode (Long rdCode);
}
