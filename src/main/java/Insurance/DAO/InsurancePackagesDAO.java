package Insurance.DAO;

import java.util.List;

import Insurance.Entities.InsurancePackages;

public interface InsurancePackagesDAO {
	public List<InsurancePackages> getAllInsurancePackages();

	public InsurancePackages getInsurancePackagesById(Integer idPackage);

	public boolean insertInsurancePackages(InsurancePackages insurancePackage);

	public boolean updateInsurancePackages(InsurancePackages insurancePackage);

	public boolean deleteInsurancePackages(Integer idPackage);

	public List<InsurancePackages> searchInsurancePackagesName(String namePackage);
}
