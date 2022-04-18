package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.RoleDAO;
import Insurance.Entities.InsurancePackages;
import Insurance.Entities.Role;
import Insurance.Util.HibernateUtil;

public class RoleDAOImpl implements RoleDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from Role").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public Role getRoleById(Integer idRole) {
		// TODO Auto-generated method stub
		try {
			Role role = ss.get(Role.class, "idRole");
			return role;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertRole(Role role) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(role);
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
	public boolean updateRole(Role role) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(role);
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
	public boolean deleteRole(Integer idRole) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getRoleById(idRole));
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
	public List<Role> searchRoleName(String nameRole) {
		// TODO Auto-generated method stub
		try {
			if (nameRole == null || nameRole.length() == 0) {
				nameRole = "%";
			} else {
				nameRole = "%" + nameRole + "%";
			}
			List list = ss.createQuery("from Role where nameRole like :nameRole")
					.setParameter("nameRole", nameRole).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
