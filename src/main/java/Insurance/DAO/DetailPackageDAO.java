package Insurance.DAO;

import java.util.List;

import Insurance.Entities.DetailPackage;

public interface DetailPackageDAO {
	public List<DetailPackage> getAllDetailPackage();

	public DetailPackage getDetailPackageById(Integer idDetailPackage);

	public boolean insertDetailPackage(DetailPackage detailPackage);

	public boolean updateDetailPackage(DetailPackage detailPackage);

	public boolean deleteDetailPackage(Integer idDetailPackage);

	public List<DetailPackage> searchDetailPackageDescription(String descriptionPackage);
}
