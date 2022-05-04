package Insurance.DAO.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.OrderInsuranceDAO;
import Insurance.Entities.OrderInsurance;
import Insurance.Util.HibernateUtil;

public class OrderInsuranceDAOImpl implements OrderInsuranceDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public List<OrderInsurance> getAllOrderInsurance() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from OrderInsurance").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public OrderInsurance getOrderInsuranceById(Integer idOrder) {
		// TODO Auto-generated method stub
		try {
			OrderInsurance order = ss.get(OrderInsurance.class, "idOrder");
			return order;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertOrderInsurance(OrderInsurance orderInsurance) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        orderInsurance.setCreated_at_Order(date);
		try {
			ss.beginTransaction();
			ss.save(orderInsurance);
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
	public boolean updateOrderInsurance(OrderInsurance orderInsurance) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(orderInsurance);
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
	public boolean deleteOrderInsurance(Integer idOrder) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getOrderInsuranceById(idOrder));
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

}
