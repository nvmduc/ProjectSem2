package Insurance.DAO.Impl;

import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.EvaluateDAO;
import Insurance.Entities.Evaluate;
import Insurance.Util.HibernateUtil;

public class EvaluateDAOImpl implements EvaluateDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public List<Evaluate> getAllEvaluate() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from Evaluate").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public Evaluate getEvaluateById(Integer idEvaluate) {
		// TODO Auto-generated method stub
		try {
			Evaluate evaluate = ss.get(Evaluate.class, "idEvaluate");
			return evaluate;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertEvaluate(Evaluate evaluate) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.save(evaluate);
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
	public boolean updateEvaluate(Evaluate evaluate) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(evaluate);
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
	public boolean deleteEvaluate(Integer idEvaluate) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getEvaluateById(idEvaluate));
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
	public List<Evaluate> searchEvaluateContent(String contentEvaluate) {
		// TODO Auto-generated method stub
		try {
			if (contentEvaluate == null || contentEvaluate.length() == 0) {
				contentEvaluate = "%";
			} else {
				contentEvaluate = "%" + contentEvaluate + "%";
			}
			List list = ss.createQuery("from Evaluate where contentEvaluate like :contentEvaluate")
					.setParameter("contentEvaluate", contentEvaluate).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
