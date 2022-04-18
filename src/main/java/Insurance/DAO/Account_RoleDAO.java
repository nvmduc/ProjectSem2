package Insurance.DAO;

import java.util.List;

import Insurance.Entities.Account_Role;

public interface Account_RoleDAO {
	public List<Account_Role> getAllAccount_Role();

	public Account_Role getAccount_RoleById(Integer idAccountRole);

	public boolean insertAccount_Role(Account_Role accountRole);

	public boolean updateAccount_Role(Account_Role accountRole);

	public boolean deleteAccount_Role(Integer idAccountRole);
}
