package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.Account_RoleDAO;
import Insurance.Entities.Account_Role;
import Insurance.Util.HibernateUtil;

public class Account_RoleDAOImpl implements Account_RoleDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	@Override
	public List<Account_Role> getAllAccount_Role() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from Account_Role").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public Account_Role getAccount_RoleById(Integer idAccountRole) {
		// TODO Auto-generated method stub
		try {
			Account_Role accRole = ss.get(Account_Role.class, "idAccountRole");
			return accRole;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertAccount_Role(Account_Role accountRole) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(accountRole);
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
	public boolean updateAccount_Role(Account_Role accountRole) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(accountRole);
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
	public boolean deleteAccount_Role(Integer idAccountRole) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getAccount_RoleById(idAccountRole));
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
}


