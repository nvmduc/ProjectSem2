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

import Insurance.DAO.Impl.InsurancePackagesDAOImpl;
import Insurance.DTO.InsurancePackageDTO;
import Insurance.Entities.InsurancePackages;

@Path("/package-service")
public class PackageService {
	Gson son = new Gson();

	@GET
	@Path("/getAllPackage")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllPackage() {
		List<InsurancePackages> listPackage = new InsurancePackagesDAOImpl().getAllInsurancePackages();
		List<InsurancePackageDTO> listData = new ArrayList<InsurancePackageDTO>();
		for (InsurancePackages p : listPackage) {
			InsurancePackageDTO packageDTO = new InsurancePackageDTO(p.getIdPackage(), p.getNamePackage(),
					p.getImagePackage(), p.getStatusPackage(), p.getCreated_at_Package());
			listData.add(packageDTO);
		}

		String data = son.toJson(listData);
		return data;
	}

	@GET
	@Path("/getPackageById/{idPackage}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPackageById(@PathParam("idPackage") Integer idPackage) {
		InsurancePackages p = new InsurancePackagesDAOImpl().getInsurancePackagesById(idPackage);
		InsurancePackageDTO packageDTO = new InsurancePackageDTO(p.getIdPackage(), p.getNamePackage(),
				p.getImagePackage(), p.getStatusPackage(), p.getCreated_at_Package());
		String data = son.toJson(packageDTO);
		return data;
	}

	@POST
	@Path("/insertPackage")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertPackage(String jsonPackage) {
		InsurancePackageDTO packageDTO = son.fromJson(jsonPackage, InsurancePackageDTO.class);
		InsurancePackages pack = new InsurancePackages(0, packageDTO.getNamePackage(), packageDTO.getImagePackage(),
				packageDTO.getStatusPackage(), packageDTO.getCreated_at_Package(), null, null);
		boolean bl = new InsurancePackagesDAOImpl().insertInsurancePackages(pack);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updatePackage")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updatePackage(String jsonPackage) {
		InsurancePackageDTO packageDTO = son.fromJson(jsonPackage, InsurancePackageDTO.class);
		InsurancePackages pack = new InsurancePackages(packageDTO.getIdPackage(), packageDTO.getNamePackage(), packageDTO.getImagePackage(),
				packageDTO.getStatusPackage(), packageDTO.getCreated_at_Package(), null, null);
		boolean bl = new InsurancePackagesDAOImpl().updateInsurancePackages(pack);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/deletePackage/{idPackage}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deletePackage(@PathParam("idPackage") Integer idPackage) {
		boolean bl = new InsurancePackagesDAOImpl().deleteInsurancePackages(idPackage);
		String data = son.toJson(bl);
		return data;
	}

	@GET
	@Path("/getPackageByName/{namePackage}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPackageByName(@PathParam("namePackage") String namePackage) {
		List<InsurancePackages> listPackages = new InsurancePackagesDAOImpl().searchInsurancePackagesName(namePackage);
		List<InsurancePackageDTO> listData = new ArrayList<InsurancePackageDTO>();
		for (InsurancePackages packages : listPackages) {
			InsurancePackageDTO packageDTO = new InsurancePackageDTO(packages.getIdPackage(), packages.getNamePackage(),
					packages.getImagePackage(), packages.getStatusPackage(), packages.getCreated_at_Package());
			listData.add(packageDTO);
		}
		String data = son.toJson(listPackages);
		return data;
	}
}
