package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.InformationCarDAO;
import Insurance.Entities.InformationCar;
import Insurance.Util.HibernateUtil;

public class InformationCarDAOImpl implements InformationCarDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	@Override
	public List<InformationCar> getAllInformationCars() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from InformationCar").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public InformationCar getInformationCarById(Integer idInformationCar) {
		// TODO Auto-generated method stub
		try {
			InformationCar inforCar = ss.get(InformationCar.class, "idInformationCar");
			return inforCar;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertInformationCar(InformationCar informationCar) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(informationCar);
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
	public boolean updateInformationCar(InformationCar informationCar) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(informationCar);
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
	public boolean deleteInformationCar(Integer idInformationCar) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getInformationCarById(idInformationCar));
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
	public List<InformationCar> searchInformationCarCompany(String carCompany) {
		// TODO Auto-generated method stub
		try {
			if (carCompany == null || carCompany.length() == 0) {
				carCompany = "%";
			} else {
				carCompany = "%" + carCompany + "%";
			}
			List list = ss.createQuery("from InformationCar where carCompany like :carCompany")
					.setParameter("carCompany", carCompany).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
