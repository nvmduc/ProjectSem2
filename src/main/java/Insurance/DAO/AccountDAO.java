package Insurance.DAO;

import java.util.List;

import Insurance.Entities.Account;

public interface AccountDAO {
	public List<Account> getAllAccount();

	public Account getAccountById(Integer idAccount);

	public boolean insertAccount(Account account);

	public boolean updateAccount(Account account);

	public boolean deleteAccount(Integer idAccount);

	public List<Account> searchAccountEmail(String email);

}
