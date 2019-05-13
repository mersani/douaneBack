package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.REFdevise;

public interface RefdeviseRepository extends JpaRepository<REFdevise,Long> {
public REFdevise findByRefdCode(String refdCode);
}
