package bns.tn.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name="ROLE")
@Entity
public class Role implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_ROLE")
	private Long id ;
	
	@Column(name="NAME_Role",nullable=true , length=64)
	private String roleName;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public Role(String roleName) {
		super();
		this.roleName = roleName;
		
	}

	

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

