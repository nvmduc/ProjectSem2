package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.DetailPackageDAO;
import Insurance.Entities.DetailPackage;
import Insurance.Util.HibernateUtil;

public class DetailPackageDAOImpl implements DetailPackageDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public List<DetailPackage> getAllDetailPackage() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from DetailPackage").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public DetailPackage getDetailPackageById(Integer idDetailPackage) {
		// TODO Auto-generated method stub
		try {
			DetailPackage detailPackage = ss.get(DetailPackage.class, "idDetailPackage");
			return detailPackage;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertDetailPackage(DetailPackage detailPackage) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(detailPackage);
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
	public boolean updateDetailPackage(DetailPackage detailPackage) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(detailPackage);
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
	public boolean deleteDetailPackage(Integer idDetailPackage) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getDetailPackageById(idDetailPackage));
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
	public List<DetailPackage> searchDetailPackageDescription(String descriptionPackage) {
		// TODO Auto-generated method stub
		try {
			if (descriptionPackage == null || descriptionPackage.length() == 0) {
				descriptionPackage = "%";
			} else {
				descriptionPackage = "%" + descriptionPackage + "%";
			}
			List list = ss.createQuery("from DetailPackage where descriptionPackage like :descriptionPackage")
					.setParameter("descriptionPackage", descriptionPackage).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
