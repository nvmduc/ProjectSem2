package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.InsurancePackagesDAO;
import Insurance.Entities.InsurancePackages;
import Insurance.Util.HibernateUtil;

public class InsurancePackagesDAOImpl implements InsurancePackagesDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public List<InsurancePackages> getAllInsurancePackages() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from InsurancePackages").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public InsurancePackages getInsurancePackagesById(Integer idPackage) {
		// TODO Auto-generated method stub
		try {
			InsurancePackages insurancePackage = ss.get(InsurancePackages.class, "idPackage");
			return insurancePackage;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertInsurancePackages(InsurancePackages insurancePackage) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(insurancePackage);
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
	public boolean updateInsurancePackages(InsurancePackages insurancePackage) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(insurancePackage);
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
	public boolean deleteInsurancePackages(Integer idPackage) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getInsurancePackagesById(idPackage));
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
	public List<InsurancePackages> searchInsurancePackagesName(String namePackage) {
		// TODO Auto-generated method stub
		try {
			if (namePackage == null || namePackage.length() == 0) {
				namePackage = "%";
			} else {
				namePackage = "%" + namePackage + "%";
			}
			List list = ss.createQuery("from InsurancePackages where namePackage like :namePackage")
					.setParameter("namePackage", namePackage).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
