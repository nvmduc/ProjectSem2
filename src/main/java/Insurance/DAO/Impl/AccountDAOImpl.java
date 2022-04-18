package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.AccountDAO;
import Insurance.Entities.Account;
import Insurance.Util.HibernateUtil;

public class AccountDAOImpl implements AccountDAO {
	Session ss = HibernateUtil. getSessionFactory().openSession();
	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from Account").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public Account getAccountById(Integer idAccount) {
		// TODO Auto-generated method stub
		try {
			Account account = ss.get(Account.class, "idAccount");
			return account;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertAccount(Account account) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(account);
			ss.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			ss.getTransaction().rollback();
		} finally {
			ss.close();
		}
		return false;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(account);
			ss.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			ss.getTransaction().rollback();
		} finally {
			ss.close();
		}
		return false;
	}

	@Override
	public boolean deleteAccount(Integer idAccount) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getAccountById(idAccount));
			ss.getTransaction().commit();;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			ss.getTransaction().rollback();
		} finally {
			ss.close();
		}
		return false;
	}

	@Override
	public List<Account> searchAccountEmail(String email) {
		// TODO Auto-generated method stub
		try {
			if (email == null || email.length() == 0) {
				email = "%";
			} else {
				email = "%" + email + "%";
			}
			List list = ss.createQuery("from Account where email like :email")
					.setParameter("email", email).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(new AccountDAOImpl().getAllAccount());
	}

}
