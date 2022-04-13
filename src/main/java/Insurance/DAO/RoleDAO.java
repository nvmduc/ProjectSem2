package Insurance.DAO;

import java.util.List;

import Insurance.Entities.Role;

public interface RoleDAO {
	public List<Role> getAllRole();

	public Role getRoleById(Integer idRole);

	public boolean insertRole(Role role);

	public boolean updateRole(Role role);

	public boolean deleteRole(Integer idRole);

	public List<Role> searchRoleName(String nameRole);
}
