package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Rapport;

public interface RapportRepository extends JpaRepository<Rapport, Long>{

}
