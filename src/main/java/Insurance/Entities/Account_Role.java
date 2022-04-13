package Insurance.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Account_Role")
public class Account_Role {
	@Id
	@Column(name = "idAccountRole")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAccountRole;

	@ManyToOne
	@JoinColumn(name = "idRole", referencedColumnName = "idRole")
	private Role objRole;

	@ManyToOne
	@JoinColumn(name = "idAccount", referencedColumnName = "idAccount")
	private Account objAccount_Role;

	@Column(name = "status")
	private Integer status;
	@Column(name = "created_at")
	private Date created_at;

	public Account_Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account_Role(Integer idAccountRole, Role objRole, Account objAccount_Role, Integer status, Date created_at) {
		super();
		this.idAccountRole = idAccountRole;
		this.objRole = objRole;
		this.objAccount_Role = objAccount_Role;
		this.status = status;
		this.created_at = created_at;
	}

	public Integer getIdAccountRole() {
		return idAccountRole;
	}

	public void setIdAccountRole(Integer idAccountRole) {
		this.idAccountRole = idAccountRole;
	}

	public Role getObjRole() {
		return objRole;
	}

	public void setObjRole(Role objRole) {
		this.objRole = objRole;
	}

	public Account getObjAccount_Role() {
		return objAccount_Role;
	}

	public void setObjAccount_Role(Account objAccount_Role) {
		this.objAccount_Role = objAccount_Role;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

}
