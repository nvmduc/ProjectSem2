package Insurance.DTO;

import java.util.Date;

public class ContractInsuranceDTO {
	private String idContract;
	private Integer idOrder;
	private Integer idAccount;
	private Integer idInformationCar;
	private Integer idPackage;
	private Date dayStartInsurance;
	private Date dayEndInsurance;
	private Integer status;
	private Date created_at;
	public ContractInsuranceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractInsuranceDTO(String idContract, Integer idOrder, Integer idAccount, Integer idInformationCar,
			Integer idPackage, Date dayStartInsurance, Date dayEndInsurance, Integer status, Date created_at) {
		super();
		this.idContract = idContract;
		this.idOrder = idOrder;
		this.idAccount = idAccount;
		this.idInformationCar = idInformationCar;
		this.idPackage = idPackage;
		this.dayStartInsurance = dayStartInsurance;
		this.dayEndInsurance = dayEndInsurance;
		this.status = status;
		this.created_at = created_at;
	}
	public String getIdContract() {
		return idContract;
	}
	public void setIdContract(String idContract) {
		this.idContract = idContract;
	}
	public Integer getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}
	public Integer getIdInformationCar() {
		return idInformationCar;
	}
	public void setIdInformationCar(Integer idInformationCar) {
		this.idInformationCar = idInformationCar;
	}
	public Integer getIdPackage() {
		return idPackage;
	}
	public void setIdPackage(Integer idPackage) {
		this.idPackage = idPackage;
	}
	public Date getDayStartInsurance() {
		return dayStartInsurance;
	}
	public void setDayStartInsurance(Date dayStartInsurance) {
		this.dayStartInsurance = dayStartInsurance;
	}
	public Date getDayEndInsurance() {
		return dayEndInsurance;
	}
	public void setDayEndInsurance(Date dayEndInsurance) {
		this.dayEndInsurance = dayEndInsurance;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
}
