package Insurance.DAO.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import Insurance.DAO.BannerDAO;
import Insurance.Entities.Account;
import Insurance.Entities.Banner;
import Insurance.Entities.InsurancePackages;
import Insurance.Util.HibernateUtil;

public class BannerDAOImpl implements BannerDAO{
	Session ss = HibernateUtil. getSessionFactory().openSession();

	@Override
	public List<Banner> getAllBanner() {
		// TODO Auto-generated method stub
		try {
			List list = ss.createQuery("from Banner").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public Banner getBannerById(Integer idBanner) {
		// TODO Auto-generated method stub
		try {
			Banner banner = ss.get(Banner.class, idBanner);
			return banner;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			ss.close();
		}
		return null;
	}

	@Override
	public boolean insertBanner(Banner banner) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        banner.setCreated_at(date);
		try {
			ss.beginTransaction();
			ss.save(banner);
			ss.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ss.getTransaction().rollback();
		} finally {
			ss.close();
		}
		return false;
	}

	@Override
	public boolean updateBanner(Banner banner) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        banner.setCreated_at(date);
		try {
			ss.beginTransaction();
			ss.update(banner);
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
	public boolean deleteBanner(Integer idBanner) {
		// TODO Auto-generated method stub
		try {
			ss.beginTransaction();
			Integer idB = ss.createQuery("update Banner set status = 0 where idBanner = :idBanner").setParameter("idBanner", idBanner).executeUpdate();
			ss.getTransaction().commit();
			if (idB>0)
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
	public List<Banner> searchBanner(String nameBanner) {
		// TODO Auto-generated method stub
		try {
			if (nameBanner == null || nameBanner.length() == 0) {
				nameBanner = "%";
			} else {
				nameBanner = "%" + nameBanner + "%";
			}
			List list = ss.createQuery("from Banner where nameBanner like :nameBanner")
					.setParameter("nameBanner", nameBanner).list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
}
