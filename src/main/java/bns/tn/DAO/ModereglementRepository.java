package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Modereglement;

public interface ModereglementRepository extends JpaRepository<Modereglement,Long>{
public Modereglement findByMrCode (String mrCode);
}