package Insurance.DAO;

import java.util.List;

import Insurance.Entities.ContractInsurance;

public interface ContractInsuranceDAO {
	public List<ContractInsurance> getAllContractInsurance();

	public ContractInsurance getContractInsuranceById(String idContract);

	public boolean insertContractInsurance(ContractInsurance contract);

	public boolean updateContractInsurance(ContractInsurance contract);

	public boolean deleteContractInsurance(String idContract);
	
	public boolean searchContractInsuranceById(String idContract);

}
