package Insurance.DTO;

import java.util.Date;

public class OrderInsuranceDTO {
	private Integer idOrder;
	private Integer idPackage;
	private Integer idInformationCar;
	private Integer idAccount;
	private Integer numberYearInsurance;
	private Integer statusOrder;
	private Date created_at_Order;
	public OrderInsuranceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderInsuranceDTO(Integer idOrder, Integer idPackage, Integer idInformationCar, Integer idAccount,
			Integer numberYearInsurance, Integer statusOrder, Date created_at_Order) {
		super();
		this.idOrder = idOrder;
		this.idPackage = idPackage;
		this.idInformationCar = idInformationCar;
		this.idAccount = idAccount;
		this.numberYearInsurance = numberYearInsurance;
		this.statusOrder = statusOrder;
		this.created_at_Order = created_at_Order;
	}
	public Integer getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
	public Integer getIdPackage() {
		return idPackage;
	}
	public void setIdPackage(Integer idPackage) {
		this.idPackage = idPackage;
	}
	public Integer getIdInformationCar() {
		return idInformationCar;
	}
	public void setIdInformationCar(Integer idInformationCar) {
		this.idInformationCar = idInformationCar;
	}
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}
	public Integer getNumberYearInsurance() {
		return numberYearInsurance;
	}
	public void setNumberYearInsurance(Integer numberYearInsurance) {
		this.numberYearInsurance = numberYearInsurance;
	}
	public Integer getStatusOrder() {
		return statusOrder;
	}
	public void setStatusOrder(Integer statusOrder) {
		this.statusOrder = statusOrder;
	}
	public Date getCreated_at_Order() {
		return created_at_Order;
	}
	public void setCreated_at_Order(Date created_at_Order) {
		this.created_at_Order = created_at_Order;
	}
	
}
