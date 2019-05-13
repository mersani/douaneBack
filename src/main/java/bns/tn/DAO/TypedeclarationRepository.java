package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Typedeclaration;

public interface TypedeclarationRepository extends JpaRepository<Typedeclaration, Long>{
public Typedeclaration findByTypedecCode (Long typedecCode);
}
