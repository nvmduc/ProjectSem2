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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "InformationCar")
public class InformationCar {
	@Id
	@Column(name = "idInformationCar")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInformationCar;
	@NotEmpty(message = "Car company is emplty")
	@Column(name = "carCompany")
	private String carCompany;
	@NotEmpty(message = "Car line is emplty")
	@Column(name = "carLine")
	private String carLine;
	@NotEmpty(message = "Car type is emplty")
	@Column(name = "carType")
	private String carType;
	@NotNull(message = "Year Of Manufacture is null")
	@Column(name = "yearOfManufacture")
	private Integer yearOfManufacture;
	@NotEmpty(message = "Frame Number is emplty")
	@Column(name = "frameNumber")
	private String frameNumber;
	@NotEmpty(message = "Engine Number is emplty")
	@Column(name = "engineNumber")
	private String engineNumber;
	@NotEmpty(message = "Sea Of Control is emplty")
	@Column(name = "seaOfControl")
	private String seaOfControl;
	@NotNull(message = "Seats is not null")
	@Column(name = "seats")
	private Integer seats;
	@Column(name = "statusInformationCar")
	private Integer statusInformationCar;
	@Column(name = "created_at_InformationCar")
	private Date created_at_InformationCar;

	@ManyToOne
	@JoinColumn(name = "idAccount", referencedColumnName = "idAccount")
	private Account objAccount_InformationCar;

	@OneToMany(mappedBy = "objInformation_Detail")
	private Set<DetailPackage> listlistDetailPackage_Detail;

	@OneToMany(mappedBy = "objInformationCar_Order")
	private Set<OrderInsurance> listInformationCar_Order;

	@OneToMany(mappedBy = "objInformationCar_Contract")
	private Set<ContractInsurance> listInformationCar_Contract;

	public InformationCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InformationCar(Integer idInformationCar, @NotEmpty(message = "Car company is emplty") String carCompany,
			@NotEmpty(message = "Car line is emplty") String carLine,
			@NotEmpty(message = "Car type is emplty") String carType,
			@NotNull(message = "Year Of Manufacture is null") Integer yearOfManufacture,
			@NotEmpty(message = "Frame Number is emplty") String frameNumber,
			@NotEmpty(message = "Engine Number is emplty") String engineNumber,
			@NotEmpty(message = "Sea Of Control is emplty") String seaOfControl,
			@NotNull(message = "Seats is not null") Integer seats, Integer statusInformationCar,
			Date created_at_InformationCar, Account objAccount_InformationCar,
			Set<DetailPackage> listlistDetailPackage_Detail, Set<OrderInsurance> listInformationCar_Order,
			Set<ContractInsurance> listInformationCar_Contract) {
		super();
		this.idInformationCar = idInformationCar;
		this.carCompany = carCompany;
		this.carLine = carLine;
		this.carType = carType;
		this.yearOfManufacture = yearOfManufacture;
		this.frameNumber = frameNumber;
		this.engineNumber = engineNumber;
		this.seaOfControl = seaOfControl;
		this.seats = seats;
		this.statusInformationCar = statusInformationCar;
		this.created_at_InformationCar = created_at_InformationCar;
		this.objAccount_InformationCar = objAccount_InformationCar;
		this.listlistDetailPackage_Detail = listlistDetailPackage_Detail;
		this.listInformationCar_Order = listInformationCar_Order;
		this.listInformationCar_Contract = listInformationCar_Contract;
	}

	public Integer getIdInformationCar() {
		return idInformationCar;
	}

	public void setIdInformationCar(Integer idInformationCar) {
		this.idInformationCar = idInformationCar;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarLine() {
		return carLine;
	}

	public void setCarLine(String carLine) {
		this.carLine = carLine;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Integer getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Integer yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getFrameNumber() {
		return frameNumber;
	}

	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getSeaOfControl() {
		return seaOfControl;
	}

	public void setSeaOfControl(String seaOfControl) {
		this.seaOfControl = seaOfControl;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getStatusInformationCar() {
		return statusInformationCar;
	}

	public void setStatusInformationCar(Integer statusInformationCar) {
		this.statusInformationCar = statusInformationCar;
	}

	public Date getCreated_at_InformationCar() {
		return created_at_InformationCar;
	}

	public void setCreated_at_InformationCar(Date created_at_InformationCar) {
		this.created_at_InformationCar = created_at_InformationCar;
	}

	public Account getObjAccount_InformationCar() {
		return objAccount_InformationCar;
	}

	public void setObjAccount_InformationCar(Account objAccount_InformationCar) {
		this.objAccount_InformationCar = objAccount_InformationCar;
	}

	public Set<DetailPackage> getListlistDetailPackage_Detail() {
		return listlistDetailPackage_Detail;
	}

	public void setListlistDetailPackage_Detail(Set<DetailPackage> listlistDetailPackage_Detail) {
		this.listlistDetailPackage_Detail = listlistDetailPackage_Detail;
	}

	public Set<OrderInsurance> getListInformationCar_Order() {
		return listInformationCar_Order;
	}

	public void setListInformationCar_Order(Set<OrderInsurance> listInformationCar_Order) {
		this.listInformationCar_Order = listInformationCar_Order;
	}

	public Set<ContractInsurance> getListInformationCar_Contract() {
		return listInformationCar_Contract;
	}

	public void setListInformationCar_Contract(Set<ContractInsurance> listInformationCar_Contract) {
		this.listInformationCar_Contract = listInformationCar_Contract;
	}


}
