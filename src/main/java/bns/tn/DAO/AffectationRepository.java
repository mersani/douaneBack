package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Affectation;

public interface AffectationRepository extends JpaRepository<Affectation, Long> {
public Affectation findByAffCode (Long affCode);
}