package bns.tn.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import bns.tn.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long>{

}