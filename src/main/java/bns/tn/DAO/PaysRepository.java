package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Pays;
public interface PaysRepository extends JpaRepository<Pays,Long> {
public Pays findByPCodeAlpha(String pCodeAlpha);
}
