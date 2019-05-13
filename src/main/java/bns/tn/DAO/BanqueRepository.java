package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Banque;


public interface BanqueRepository extends JpaRepository<Banque,Long>{
public Banque findByBCode (Long bCode);
}

