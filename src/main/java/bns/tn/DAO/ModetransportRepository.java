package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import bns.tn.entities.Modetransport;

public interface ModetransportRepository extends JpaRepository<Modetransport, Long> {
public Modetransport findByMdtCode (Long mdtCode);
}
