package Insurance.Entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "OrderInsurance")
public class OrderInsurance {
	@Id
	@Column(name = "idOrder")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrder;
	@NotNull(message = "Number Year Insurance is emplty")
	@Column(name = "numberYearInsurance")
	private String numberYearInsurance;
	@Column(name = "statusOrder")
	private Integer statusOrder;
	@Column(name = "created_at_Order")
	private Date created_at_Order;

	@ManyToOne
	@JoinColumn(name = "idPackage", referencedColumnName = "idPackage")
	private InsurancePackages objInsurancePackages_Order;

	@ManyToOne
	@JoinColumn(name = "idInformationCar", referencedColumnName = "idInformationCar")
	private InformationCar objInformationCar_Order;

	@ManyToOne
	@JoinColumn(name = "idAccount", referencedColumnName = "idAccount")
	private Account objAccount_OrderInsurance;

	@OneToMany(mappedBy = "objOrderInsurance_Contract")
	private Set<ContractInsurance> listOrderInsurance_Contract;

	public OrderInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderInsurance(int idOrder, @NotNull(message = "Number Year Insurance is emplty") String numberYearInsurance,
			Integer statusOrder, Date created_at_Order, InsurancePackages objInsurancePackages_Order,
			InformationCar objInformationCar_Order, Account objAccount_OrderInsurance,
			Set<ContractInsurance> listOrderInsurance_Contract) {
		super();
		this.idOrder = idOrder;
		this.numberYearInsurance = numberYearInsurance;
		this.statusOrder = statusOrder;
		this.created_at_Order = created_at_Order;
		this.objInsurancePackages_Order = objInsurancePackages_Order;
		this.objInformationCar_Order = objInformationCar_Order;
		this.objAccount_OrderInsurance = objAccount_OrderInsurance;
		this.listOrderInsurance_Contract = listOrderInsurance_Contract;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public String getNumberYearInsurance() {
		return numberYearInsurance;
	}

	public void setNumberYearInsurance(String numberYearInsurance) {
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

	public InsurancePackages getObjInsurancePackages_Order() {
		return objInsurancePackages_Order;
	}

	public void setObjInsurancePackages_Order(InsurancePackages objInsurancePackages_Order) {
		this.objInsurancePackages_Order = objInsurancePackages_Order;
	}

	public InformationCar getObjInformationCar_Order() {
		return objInformationCar_Order;
	}

	public void setObjInformationCar_Order(InformationCar objInformationCar_Order) {
		this.objInformationCar_Order = objInformationCar_Order;
	}

	public Account getObjAccount_OrderInsurance() {
		return objAccount_OrderInsurance;
	}

	public void setObjAccount_OrderInsurance(Account objAccount_OrderInsurance) {
		this.objAccount_OrderInsurance = objAccount_OrderInsurance;
	}

	public Set<ContractInsurance> getListOrderInsurance_Contract() {
		return listOrderInsurance_Contract;
	}

	public void setListOrderInsurance_Contract(Set<ContractInsurance> listOrderInsurance_Contract) {
		this.listOrderInsurance_Contract = listOrderInsurance_Contract;
	}

}
