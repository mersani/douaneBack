package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Detailstaxe;

public interface detailstaxesRepository extends JpaRepository<Detailstaxe,Long>{
public Detailstaxe findByDtCode (Long dtCode);}
