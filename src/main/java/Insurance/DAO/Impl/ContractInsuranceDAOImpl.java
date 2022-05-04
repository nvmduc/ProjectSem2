package Insurance.DAO.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.ContractInsuranceDAO;
import Insurance.Entities.ContractInsurance;
import Insurance.Util.HibernateUtil;

public class ContractInsuranceDAOImpl implements ContractInsuranceDAO {
	Session ss = HibernateUtil.getSessionFactory().openSession();
	@Override
	public List<ContractInsurance> getAllContractInsurance() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from ContractInsurance").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public ContractInsurance getContractInsuranceById(String idContract) {
		// TODO Auto-generated method stub
		try {
			ContractInsurance contract = ss.get(ContractInsurance.class, "idContract");
			return contract;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertContractInsurance(ContractInsurance contract) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        contract.setCreated_at(date);
		try {
			ss.beginTransaction();
			ss.save(contract);
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
	public boolean updateContractInsurance(ContractInsurance contract) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.update(contract);
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
	public boolean deleteContractInsurance(String idContract) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			ss.delete(getContractInsuranceById(idContract));
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
	public boolean searchContractInsuranceById(String idContract) {
		// TODO Auto-generated method stub
		return false;
	}

}
