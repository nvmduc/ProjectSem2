package Insurance.Entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Role")
public class Role {
	@Id
	@Column(name = "idRole")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRole;
	@NotEmpty(message = "Name is emplty")
	@Column(name = "nameRole")
	private String nameRole;
	@Column(name = "statusRole")
	private Integer statusRole;
	@Column(name = "created_at_Role")
	private Date created_at_Role;

	@OneToMany(mappedBy = "objRole")
	private Set<Account_Role> listRole;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer idRole, @NotEmpty(message = "Name is emplty") String nameRole, Integer statusRole,
			Date created_at_Role, Set<Account_Role> listRole) {
		super();
		this.idRole = idRole;
		this.nameRole = nameRole;
		this.statusRole = statusRole;
		this.created_at_Role = created_at_Role;
		this.listRole = listRole;
	}

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public Integer getStatusRole() {
		return statusRole;
	}

	public void setStatusRole(Integer statusRole) {
		this.statusRole = statusRole;
	}

	public Date getCreated_at_Role() {
		return created_at_Role;
	}

	public void setCreated_at_Role(Date created_at_Role) {
		this.created_at_Role = created_at_Role;
	}

	public Set<Account_Role> getListRole() {
		return listRole;
	}

	public void setListRole(Set<Account_Role> listRole) {
		this.listRole = listRole;
	}

}
