package Insurance.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import Insurance.DAO.Impl.AccountDAOImpl;
import Insurance.DTO.AccountDTO;
import Insurance.Entities.Account;

@Path("/insurance-service")
public class AccountService {
	Gson son = new Gson();

	@GET
	@Path("/getAllAccount")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCompanys() {
		List<Account> listAcc = new AccountDAOImpl().getAllAccount();
		List<AccountDTO> listData = new ArrayList<AccountDTO>();
		for (Account a : listAcc) {
        	AccountDTO accdto = new AccountDTO(a.getIdAccount(),a.getName(),a.getEmail(),a.getAvatar(),a.getPassword(), a.getBirthDay(),a.getCity(),a.getDistrict(),a.getWards(),a.getStreet(),a.getApartmentNumber(),null, a.getStatusAccount(),a.getCreated_at_Account());
        	listData.add(accdto);
        }

		String data = son.toJson(listData);
		return data;
	}
}
