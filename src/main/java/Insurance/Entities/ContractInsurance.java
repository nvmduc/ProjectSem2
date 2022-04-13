package Insurance.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ContractInsurance")
public class ContractInsurance {
	@Id
	@Column(name = "idContract")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContract;
	@NotNull(message = "Day Start Insurance is emplty")
	@Column(name = "dayStartInsurance")
	private Date dayStartInsurance;
	@NotNull(message = "Day End Insurance is emplty")
	@Column(name = "dayEndInsurance")
	private Date dayEndInsurance;
	@Column(name = "status")
	private Integer status;
	@Column(name = "created_at")
	private Date created_at;

	@ManyToOne
	@JoinColumn(name = "idOrder", referencedColumnName = "idOrder")
	private OrderInsurance objOrderInsurance_Contract;

	@ManyToOne
	@JoinColumn(name = "idAccount", referencedColumnName = "idAccount")
	private Account objAccount_Contract;

	@ManyToOne
	@JoinColumn(name = "idInformationCar", referencedColumnName = "idInformationCar")
	private InformationCar objInformationCar_Contract;

	@ManyToOne
	@JoinColumn(name = "idPackage", referencedColumnName = "idPackage")
	private InsurancePackages objInsurancePackages_Contract;

	public ContractInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractInsurance(int idContract, @NotNull(message = "Day Start Insurance is emplty") Date dayStartInsurance,
			@NotNull(message = "Day End Insurance is emplty") Date dayEndInsurance, Integer status, Date created_at,
			OrderInsurance objOrderInsurance_Contract, Account objAccount_Contract,
			InformationCar objInformationCar_Contract, InsurancePackages objInsurancePackages_Contract) {
		super();
		this.idContract = idContract;
		this.dayStartInsurance = dayStartInsurance;
		this.dayEndInsurance = dayEndInsurance;
		this.status = status;
		this.created_at = created_at;
		this.objOrderInsurance_Contract = objOrderInsurance_Contract;
		this.objAccount_Contract = objAccount_Contract;
		this.objInformationCar_Contract = objInformationCar_Contract;
		this.objInsurancePackages_Contract = objInsurancePackages_Contract;
	}

	public int getIdContract() {
		return idContract;
	}

	public void setIdContract(int idContract) {
		this.idContract = idContract;
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

	public OrderInsurance getObjOrderInsurance_Contract() {
		return objOrderInsurance_Contract;
	}

	public void setObjOrderInsurance_Contract(OrderInsurance objOrderInsurance_Contract) {
		this.objOrderInsurance_Contract = objOrderInsurance_Contract;
	}

	public Account getObjAccount_Contract() {
		return objAccount_Contract;
	}

	public void setObjAccount_Contract(Account objAccount_Contract) {
		this.objAccount_Contract = objAccount_Contract;
	}

	public InformationCar getObjInformationCar_Contract() {
		return objInformationCar_Contract;
	}

	public void setObjInformationCar_Contract(InformationCar objInformationCar_Contract) {
		this.objInformationCar_Contract = objInformationCar_Contract;
	}

	public InsurancePackages getObjInsurancePackages_Contract() {
		return objInsurancePackages_Contract;
	}

	public void setObjInsurancePackages_Contract(InsurancePackages objInsurancePackages_Contract) {
		this.objInsurancePackages_Contract = objInsurancePackages_Contract;
	}

}
