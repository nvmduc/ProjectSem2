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
			InsurancePackageDTO packageDTO = new InsurancePackageDTO(p.getIdPackage(), p.getNamePackage(),p.getImagePackage(),p.getStatusPackage(),p.getCreated_at_Package());
			listData.add(packageDTO);
		}

		String data = son.toJson(listData);
		return data;
	}	
	
	@GET
	@Path("/getPackageById/{idPackage}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPackageById(@PathParam("idPackage")Integer idPackage) {
		InsurancePackages p = new InsurancePackagesDAOImpl().getInsurancePackagesById(idPackage);
		InsurancePackageDTO packageDTO = new InsurancePackageDTO(p.getIdPackage(), p.getNamePackage(),p.getImagePackage(),p.getStatusPackage(),p.getCreated_at_Package());
		
		String data = son.toJson(packageDTO);
		return data;
	}

	@POST
	@Path("/insertPackage")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertPackage(String jsonPackage) {
		InsurancePackageDTO packageDTO = son.fromJson(jsonPackage, InsurancePackageDTO.class);
		InsurancePackages pack = new InsurancePackages(0, packageDTO.getNamePackage(),packageDTO.getImagePackage(),packageDTO.getStatusPackage(),packageDTO.getCreated_at_Package(), null, null);
		boolean bl = new InsurancePackagesDAOImpl().insertInsurancePackages(pack);
		String data = son.toJson(bl);
		return data;
	}
//	
//	@PUT
//    @Path("/updateAccount")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public String updateAccount(String jsonAccount) {
//        AccountDTO accDTO = son.fromJson(jsonAccount, AccountDTO.class);
//        Account acc = new Account(0,accDTO.getName(), accDTO.getEmail(), accDTO.getAvatar(),
//				accDTO.getPassword(),accDTO.getPhone(), accDTO.getBirthDay(), accDTO.getCity(), accDTO.getDistrict(), accDTO.getWards(), accDTO.getStreet(),
//				accDTO.getApartmentNumber(), accDTO.getZipcode(), accDTO.getStatusAccount(), accDTO.getCreated_at_Account(), null, null, null, null);
//        boolean bl = new AccountDAOImpl().updateAccount(acc);
//        String data = son.toJson(bl);
//        return data;
//    }
//	
//	@POST
//    @Path("/deleteAccount/{idAccount}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public String deleteAccount(@PathParam("idAccount")Integer idAccount) {
//        boolean bl = new AccountDAOImpl().deleteAccount(idAccount);
//        String data = son.toJson(bl);
//        return data;
//    }
//	
//	@GET
//    @Path("/getAccountByEmail/{email}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getAccountByEmail(@PathParam("email")String email) {
//        List<Account> listAccounts = new AccountDAOImpl().searchAccountEmail(email);
//        List<AccountDTO> listData = new ArrayList<AccountDTO>();
//        for (Account acc : listAccounts) {
//            AccountDTO accDTO = new AccountDTO(acc.getIdAccount(), acc.getName(), acc.getEmail(), acc.getAvatar(),
//					acc.getPassword(),acc.getPhone(), acc.getBirthDay(), acc.getCity(), acc.getDistrict(), acc.getWards(), acc.getStreet(),
//					acc.getApartmentNumber(), acc.getZipcode(), acc.getStatusAccount(), acc.getCreated_at_Account());
//            listData.add(accDTO);
//        }
//        String data = son.toJson(listAccounts);
//        return data;
//	}
}
