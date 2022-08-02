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

import com.google.gson.Gson;

import Insurance.DAO.Impl.InformationCarDAOImpl;
import Insurance.DTO.InformationCarDTO;
import Insurance.Entities.Account;
import Insurance.Entities.InformationCar;

@Path("/inforcar-service")
public class InformationCarService {
	Gson son = new Gson();

	@GET
	@Path("/getAllInforCar")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllInforCar() {
		List<InformationCar> listInforCar = new InformationCarDAOImpl().getAllInformationCars();
		List<InformationCarDTO> listData = new ArrayList<InformationCarDTO>();
		for (InformationCar car : listInforCar) {
			InformationCarDTO carDTO = new InformationCarDTO(car.getIdInformationCar(), car.getCarCompany(),
					car.getCarLine(), car.getCarType(), car.getYearOfManufacture(), car.getFrameNumber(),
					car.getEngineNumber(), car.getSeaOfControl(), car.getSeats(), car.getObjAccount_InformationCar().getIdAccount(),
					car.getStatusInformationCar(), car.getCreated_at_InformationCar());
			listData.add(carDTO);
		}
		String data = son.toJson(listData);
		return data;
	}
	

	@GET
	@Path("/getCarByAccountId/{idAccount}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCarByAccountId(@PathParam("idAccount")Integer idAccount) {
		List<InformationCar> listInforCar = new InformationCarDAOImpl().getCarByAccountId(idAccount);
		List<InformationCarDTO> listData = new ArrayList<InformationCarDTO>();
		for (InformationCar car : listInforCar) {
			InformationCarDTO carDTO = new InformationCarDTO(car.getIdInformationCar(), car.getCarCompany(),
					car.getCarLine(), car.getCarType(), car.getYearOfManufacture(), car.getFrameNumber(),
					car.getEngineNumber(), car.getSeaOfControl(), car.getSeats(), car.getObjAccount_InformationCar().getIdAccount(),
					car.getStatusInformationCar(), car.getCreated_at_InformationCar());
			listData.add(carDTO);
		}
		String data = son.toJson(listData);
		return data;
	}

	@GET
	@Path("/getCarById/{idInformationCar}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCarById(@PathParam("idInformationCar") Integer idInformationCar) {
		InformationCar car = new InformationCarDAOImpl().getInformationCarById(idInformationCar);
		InformationCarDTO carDTO = new InformationCarDTO(car.getIdInformationCar(), car.getCarCompany(),
				car.getCarLine(), car.getCarType(), car.getYearOfManufacture(), car.getFrameNumber(),
				car.getEngineNumber(), car.getSeaOfControl(), car.getSeats(), car.getObjAccount_InformationCar().getIdAccount(),
				car.getStatusInformationCar(), car.getCreated_at_InformationCar());
		String data = son.toJson(carDTO);
		return data;
	}

	@POST
	@Path("/insertCar")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertCar(String jsonCar) {
		InformationCarDTO carDTO = son.fromJson(jsonCar, InformationCarDTO.class);
		Account acc = new Account();
		acc.setIdAccount(carDTO.getIdAccount());
		InformationCar car = new InformationCar(0, carDTO.getCarCompany(), carDTO.getCarLine(), carDTO.getCarType(),
				carDTO.getYearOfManufacture(), carDTO.getFrameNumber(), carDTO.getEngineNumber(),
				carDTO.getSeaOfControl(), carDTO.getSeats(), carDTO.getStatusInformationCar(),
				carDTO.getCreated_at_InformationCar(), acc, null, null, null);
		boolean bl = new InformationCarDAOImpl().insertInformationCar(car);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updateCar")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateCar(String jsonCar) {
		InformationCarDTO carDTO = son.fromJson(jsonCar, InformationCarDTO.class);
		Account acc = new Account();
		acc.setIdAccount(carDTO.getIdAccount());
		InformationCar car = new InformationCar(carDTO.getIdInformationCar(), carDTO.getCarCompany(), carDTO.getCarLine(), carDTO.getCarType(),
				carDTO.getYearOfManufacture(), carDTO.getFrameNumber(), carDTO.getEngineNumber(),
				carDTO.getSeaOfControl(), carDTO.getSeats(), carDTO.getStatusInformationCar(),
				carDTO.getCreated_at_InformationCar(), acc, null, null, null);
		boolean bl = new InformationCarDAOImpl().updateInformationCar(car);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/deleteCar/{idInformationCar}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteCar(@PathParam("idInformationCar") Integer idInformationCar) {
		boolean bl = new InformationCarDAOImpl().deleteInformationCar(idInformationCar);
		String data = son.toJson(bl);
		return data;
	}
}
