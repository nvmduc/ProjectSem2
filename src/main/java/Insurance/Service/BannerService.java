package Insurance.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import Insurance.DAO.Impl.AccountDAOImpl;
import Insurance.DAO.Impl.BannerDAOImpl;
import Insurance.DTO.AccountDTO;
import Insurance.DTO.BannerDTO;
import Insurance.Entities.Account;
import Insurance.Entities.Banner;

@Path("/banner-service")
public class BannerService {
	Gson son = new Gson();

	@GET
	@Path("/getAllBanner")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllBanner() {
		List<Banner> listBanner = new BannerDAOImpl().getAllBanner();
		List<BannerDTO> listData = new ArrayList<BannerDTO>();
		for (Banner b : listBanner) {
			BannerDTO bannerDTO = new BannerDTO(b.getIdBanner(), b.getTitleBanner(), b.getNameBanner(),
					b.getImgBanner(), b.getDescription(), b.getStatus(), b.getCreated_at());
			listData.add(bannerDTO);
		}
		String data = son.toJson(listData);
		return data;
	}

	@GET
	@Path("/getBannerById/{idBanner}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBannerById(@PathParam("idBanner") Integer idBanner) {
		Banner b = new BannerDAOImpl().getBannerById(idBanner);
		BannerDTO bannerDTO = new BannerDTO(b.getIdBanner(), b.getTitleBanner(), b.getNameBanner(),
				b.getImgBanner(), b.getDescription(), b.getStatus(), b.getCreated_at());
		String data = son.toJson(bannerDTO);
		return data;
	}

	@POST
	@Path("/insertBanner")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertBanner(String jsonBanner) {
		BannerDTO bannerDTO = son.fromJson(jsonBanner, BannerDTO.class);
		Banner banner = new Banner(0, bannerDTO.getTitleBanner(), bannerDTO.getNameBanner(),
				bannerDTO.getImgBanner(), bannerDTO.getDescription(), bannerDTO.getStatus(), bannerDTO.getCreated_at());
		boolean bl = new BannerDAOImpl().insertBanner(banner);
		String data = son.toJson(bl);
		return data;
	}

	@PUT
	@Path("/updateBanner")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateBanner(String jsonBanner) {
		BannerDTO bannerDTO = son.fromJson(jsonBanner, BannerDTO.class);
		Banner banner = new Banner(0, bannerDTO.getTitleBanner(), bannerDTO.getNameBanner(),
				bannerDTO.getImgBanner(), bannerDTO.getDescription(), bannerDTO.getStatus(), bannerDTO.getCreated_at());
		boolean bl = new BannerDAOImpl().updateBanner(banner);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/delteteBanner/{idBanner}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String delteteBanner(@PathParam("idBanner") Integer idBanner) {
		boolean bl = new BannerDAOImpl().deleteBanner(idBanner);
		String data = son.toJson(bl);
		return data;
	}

	@GET
	@Path("/getBannerByTitle/{titleBanner}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBannerByTitle(@PathParam("titleBanner") String titleBanner) {
		List<Banner> listBanners = new BannerDAOImpl().searchBanner(titleBanner);
		List<BannerDTO> listData = new ArrayList<BannerDTO>();
		for (Banner banner : listBanners) {
			BannerDTO bannerDTO = new BannerDTO(banner.getIdBanner(), banner.getTitleBanner(), banner.getNameBanner(),
					banner.getImgBanner(), banner.getDescription(), banner.getStatus(), banner.getCreated_at());
			listData.add(bannerDTO);
		}
		String data = son.toJson(listBanners);
		return data;
	}
}
