package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.delaisreglement;

public interface DelaisreglementRepository extends JpaRepository<delaisreglement, Long>{
public delaisreglement findByDrCode (String drCode);
}
