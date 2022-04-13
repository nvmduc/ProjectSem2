package Insurance.DAO;

import java.util.List;

import Insurance.Entities.OrderInsurance;

public interface OrderInsuranceDAO {
	public List<OrderInsurance> getAllOrderInsurance();

	public OrderInsurance getOrderInsuranceById(Integer idOrder);

	public boolean insertOrderInsurance(OrderInsurance orderInsurance);

	public boolean updateOrderInsurance(OrderInsurance orderInsurance);

	public boolean deleteOrderInsurance(Integer idOrder);

	public List<OrderInsurance> searchOrderInsuranceName(String namePackage);
}
