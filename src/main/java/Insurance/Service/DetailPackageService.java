package Insurance.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;

import Insurance.DAO.Impl.DetailPackageDAOImpl;
import Insurance.DAO.Impl.InsurancePackagesDAOImpl;
import Insurance.DTO.DetailPackageDTO;
import Insurance.DTO.InsurancePackageDTO;
import Insurance.Entities.DetailPackage;
import Insurance.Entities.InsurancePackages;

@Path("/detailpack-service")
public class DetailPackageService {
	Gson son = new Gson();

	@GET
	@Path("/getAllDetailPackage")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllDetailPackage() {
		List<DetailPackage> listDetailPack = new DetailPackageDAOImpl().getAllDetailPackage();
		List<DetailPackageDTO> listData = new ArrayList<DetailPackageDTO>();
		for (DetailPackage dPackage : listDetailPack) {
			DetailPackageDTO packDTO = new DetailPackageDTO(dPackage.getIdDetailPackage(),
					dPackage.getObjInformation_Detail().getIdPackage(), dPackage.getDescriptionPackage(), dPackage.getInsuranceFees(),
					dPackage.getCompensation(), dPackage.getStatus(),dPackage.getCreated_at());
			listData.add(packDTO);
		}
		String data = son.toJson(listData);
		return data;
	}
	
	@GET
	@Path("/getDetailPackageById/{idDetailPackage}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getDetailPackageById(@PathParam("idDetailPackage") Integer idDetailPackage) {
		DetailPackage dPackage = new DetailPackageDAOImpl().getDetailPackageById(idDetailPackage);
		DetailPackageDTO dPackDTO = new DetailPackageDTO(dPackage.getIdDetailPackage(),
				dPackage.getObjInformation_Detail().getIdPackage(), dPackage.getDescriptionPackage(), dPackage.getInsuranceFees(),
				dPackage.getCompensation(), dPackage.getStatus(),dPackage.getCreated_at());
		String data = son.toJson(dPackDTO);
		return data;
	}
	
	@GET
	@Path("/getPackageById/{idPackage}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPackageById(@PathParam("idPackage") Integer idPackage) {
		DetailPackage dPackage = new DetailPackageDAOImpl().getDetailPackageById(idPackage);
		DetailPackageDTO dPackDTO = new DetailPackageDTO(dPackage.getIdDetailPackage(),
				dPackage.getObjInformation_Detail().getIdPackage(), dPackage.getDescriptionPackage(), dPackage.getInsuranceFees(),
				dPackage.getCompensation(), dPackage.getStatus(),dPackage.getCreated_at());
		String data = son.toJson(dPackDTO);
		return data;
	}

	@POST
	@Path("/insertDetailPackage")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertDetailPackage(String jsonDetailPackage) {
		DetailPackageDTO dPackageDTO = son.fromJson(jsonDetailPackage, DetailPackageDTO.class);
		InsurancePackages pack = new InsurancePackages();
		pack.setIdPackage(dPackageDTO.getIdPackage());
		DetailPackage dPack = new DetailPackage(0, dPackageDTO.getDescriptionPackage(), dPackageDTO.getInsuranceFees(),
				dPackageDTO.getCompensation(), dPackageDTO.getStatus(),dPackageDTO.getCreated_at(),pack);
		boolean bl = new DetailPackageDAOImpl().insertDetailPackage(dPack);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/updateDetailPackage")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateDetailPackage(String jsonDetailPack) {
		DetailPackageDTO dPackageDTO = son.fromJson(jsonDetailPack, DetailPackageDTO.class);
		InsurancePackages pack = new InsurancePackages();
		pack.setIdPackage(dPackageDTO.getIdPackage());
		DetailPackage dPack = new DetailPackage(0, dPackageDTO.getDescriptionPackage(), dPackageDTO.getInsuranceFees(),
				dPackageDTO.getCompensation(), dPackageDTO.getStatus(),dPackageDTO.getCreated_at(),pack);
		boolean bl = new DetailPackageDAOImpl().updateDetailPackage(dPack);
		String data = son.toJson(bl);
		return data;
	}
}
