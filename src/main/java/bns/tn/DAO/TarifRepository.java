package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Tarif;

public interface TarifRepository extends JpaRepository<Tarif,Long>{
 public Tarif findByTCodeTarif (Long tCodeTarif);
}
