package Insurance.Service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import Insurance.DAO.Impl.InformationCarDAOImpl;
import Insurance.DTO.InformationCarDTO;
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
					car.getEngineNumber(), car.getSeaOfControl(), car.getStatusInformationCar(),
					null, car.getCreated_at_InformationCar());
			listData.add(carDTO);
		}
		String data = son.toJson(listData);
		return data;
	}
}
