package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.RefSh;

public interface RefshRepository extends JpaRepository<RefSh, Long>{
public RefSh findByRefshCode (Long refshCode);
}
