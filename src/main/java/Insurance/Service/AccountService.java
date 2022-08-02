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
import Insurance.DTO.AccountDTO;
import Insurance.Entities.Account;

@Path("/account-service")
public class AccountService {
	Gson son = new Gson();

	@GET
	@Path("/getAllAccount")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllAccount() {
		List<Account> listAcc = new AccountDAOImpl().getAllAccount();
		List<AccountDTO> listData = new ArrayList<AccountDTO>();
		for (Account a : listAcc) {
			AccountDTO accdto = new AccountDTO(a.getIdAccount(), a.getName(), a.getEmail(), a.getPassword(),
					a.getPhone(), a.getAvatar(), a.getBirthDay(), a.getCity(), a.getDistrict(), a.getWards(),
					a.getStreet(), a.getApartmentNumber(), a.getZipcode(), a.getRole(), a.getStatusAccount(),
					a.getCreated_at_Account());
			listData.add(accdto);
		}

		String data = son.toJson(listData);
		return data;
	}

	@GET
	@Path("/getEmailPassword/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmailPassword(@PathParam("email") String email) {
		List<Account> listAcc = new AccountDAOImpl().searchAccountEmail(email);
		List<AccountDTO> listData = new ArrayList<AccountDTO>();
		for (Account a : listAcc) {
			AccountDTO accdto = new AccountDTO(a.getIdAccount(), a.getName(), a.getEmail(), a.getPassword(),
					a.getPhone(), a.getAvatar(), a.getBirthDay(), a.getCity(), a.getDistrict(), a.getWards(),
					a.getStreet(), a.getApartmentNumber(), a.getZipcode(), a.getRole(), a.getStatusAccount(),
					a.getCreated_at_Account());
			listData.add(accdto);
		}
		String data = son.toJson(listData);
		return data;
	}

	@GET
	@Path("/getAccountById/{idAccount}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAccountById(@PathParam("idAccount") Integer idAccount) {
		Account a = new AccountDAOImpl().getAccountById(idAccount);
		AccountDTO accDTO = new AccountDTO(a.getIdAccount(), a.getName(), a.getEmail(), a.getAvatar(), a.getPassword(),
				a.getPhone(), a.getBirthDay(), a.getCity(), a.getDistrict(), a.getWards(), a.getStreet(),
				a.getApartmentNumber(), a.getZipcode(), a.getRole(), a.getStatusAccount(), a.getCreated_at_Account());
		String data = son.toJson(accDTO);
		return data;
	}

	@POST
	@Path("/insertAccount")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertAccount(String jsonAccount) {
		AccountDTO accDTO = son.fromJson(jsonAccount, AccountDTO.class);
		Account acc = new Account(0, accDTO.getName(), accDTO.getEmail(), accDTO.getPassword(), accDTO.getPhone(),
				accDTO.getAvatar(), accDTO.getBirthDay(), accDTO.getCity(), accDTO.getDistrict(), accDTO.getWards(),
				accDTO.getStreet(), accDTO.getApartmentNumber(), accDTO.getZipcode(), accDTO.getRole(),
				accDTO.getStatusAccount(), null, null, null, null);
		boolean bl = new AccountDAOImpl().insertAccount(acc);
		String data = son.toJson(bl);
		return data;
	}

	@PUT
	@Path("/updateAccount")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateAccount(String jsonAccount) {
		AccountDTO accDTO = son.fromJson(jsonAccount, AccountDTO.class);
		Account acc = new Account(0, accDTO.getName(), accDTO.getEmail(), accDTO.getAvatar(), accDTO.getPassword(),
				accDTO.getPhone(), accDTO.getBirthDay(), accDTO.getCity(), accDTO.getDistrict(), accDTO.getWards(),
				accDTO.getStreet(), accDTO.getApartmentNumber(), accDTO.getZipcode(), accDTO.getRole(),
				accDTO.getStatusAccount(), accDTO.getCreated_at_Account(), null, null, null);
		boolean bl = new AccountDAOImpl().updateAccount(acc);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/deleteAccount/{idAccount}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteAccount(@PathParam("idAccount") Integer idAccount) {
		boolean bl = new AccountDAOImpl().deleteAccount(idAccount);
		String data = son.toJson(bl);
		return data;
	}

	@GET
	@Path("/getAccountByEmail/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAccountByEmail(@PathParam("email") String email) {
		List<Account> listAccounts = new AccountDAOImpl().searchAccountEmail(email);
		List<AccountDTO> listData = new ArrayList<AccountDTO>();
		for (Account acc : listAccounts) {
			AccountDTO accDTO = new AccountDTO(acc.getIdAccount(), acc.getName(), acc.getEmail(), acc.getAvatar(),
					acc.getPassword(), acc.getPhone(), acc.getBirthDay(), acc.getCity(), acc.getDistrict(),
					acc.getWards(), acc.getStreet(), acc.getApartmentNumber(), acc.getZipcode(), acc.getRole(),
					acc.getStatusAccount(), acc.getCreated_at_Account());
			listData.add(accDTO);
		}
		String data = son.toJson(listAccounts);
		return data;
	}

}
