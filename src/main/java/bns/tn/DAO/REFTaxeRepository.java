package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.REFTaxe;

public interface REFTaxeRepository extends JpaRepository<REFTaxe, Long>{
 public REFTaxe findByReftCode (Long reftCode);
}