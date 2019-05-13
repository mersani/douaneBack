package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Typereftaxe;

public interface TypereftaxeRepository extends JpaRepository<Typereftaxe, Long>{
 public Typereftaxe findByTypertCode (String typertCode);
}