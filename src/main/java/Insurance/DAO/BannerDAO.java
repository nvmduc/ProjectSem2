package Insurance.DAO;

import java.util.List;

import Insurance.Entities.Banner;


public interface BannerDAO {
	public List<Banner> getAllBanner();

	public Banner getBannerById(Integer idBanner);

	public boolean insertBanner(Banner banner);

	public boolean updateBanner(Banner banner);

	public boolean deleteBanner(Integer idBanner);

	public List<Banner> searchBanner(String nameBanner);
}
