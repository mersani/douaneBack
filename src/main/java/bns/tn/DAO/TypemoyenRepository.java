package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Typemoyentransport;

public interface TypemoyenRepository extends JpaRepository<Typemoyentransport,Long>{
public Typemoyentransport findByTypemoyCode (String typemoyCode);
}
