package bns.tn.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="TRANSACTION")
@Entity
public class Transaction implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String transCodeN;
	@Column( name="Libellee")
   private String transLibellee;
	public String getTransCodeN() {
		return transCodeN;
	}
	public void setTransCodeN(String transCodeN) {
		this.transCodeN = transCodeN;
	}
	public String getTransLibellee() {
		return transLibellee;
	}
	public void setTransLibellee(String transLibellee) {
		this.transLibellee = transLibellee;
	}
	public Transaction(String transCodeN, String transLibellee) {
		super();
		this.transCodeN = transCodeN;
		this.transLibellee = transLibellee;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}