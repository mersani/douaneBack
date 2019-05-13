package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Refbureaudouane;

public interface RefbureauRepository extends JpaRepository<Refbureaudouane,Long>{
public Refbureaudouane findByBdCode (String bdCode);
}