package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Moyentransport;



public interface MoyentransportRepository extends JpaRepository<Moyentransport,Long>
{
public Moyentransport findByMoyentCode (String moyentCode);
}