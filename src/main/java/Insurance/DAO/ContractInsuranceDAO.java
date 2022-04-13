package Insurance.DAO;

import java.util.List;

import Insurance.Entities.ContractInsurance;

public interface ContractInsuranceDAO {
	public List<ContractInsurance> getAllContractInsurance();

	public ContractInsurance getInsurancePackagesById(Integer idContract);

	public boolean insertContractInsurance(ContractInsurance contract);

	public boolean updateContractInsurance(ContractInsurance contract);

	public boolean deleteContractInsurance(Integer idContract);

}
