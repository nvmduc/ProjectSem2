package Insurance.DAO;

import java.util.List;

import Insurance.Entities.InformationCar;

public interface InformationCarDAO {
	public List<InformationCar> getAllInformationCars();

	public InformationCar getInformationCarById(Integer idInformationCar);

	public boolean insertInformationCar(InformationCar informationCar);

	public boolean updateInformationCar(InformationCar informationCar);

	public boolean deleteInformationCar(Integer idInformationCar);

	public List<InformationCar> searchInformationCarCompany(String carCompany);
}
