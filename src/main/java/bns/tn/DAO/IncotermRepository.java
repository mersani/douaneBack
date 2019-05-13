package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Incoterm;

public interface IncotermRepository extends JpaRepository<Incoterm,Long>{
	public Incoterm findByIncCode (String incCode);

}
