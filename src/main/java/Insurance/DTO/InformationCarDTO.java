package Insurance.DTO;

import java.util.Date;

public class InformationCarDTO {
	private Integer idInformationCar;
	private String carCompany;
	private String carLine;
	private String carType;
	private Integer yearOfManufacture;
	private String frameNumber;
	private String engineNumber;
	private String seaOfControl;
	private Integer seats;
	private Integer idAccount;
	private Integer statusInformationCar;
	private Date created_at_InformationCar;
	public InformationCarDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InformationCarDTO(Integer idInformationCar, String carCompany, String carLine, String carType,
			Integer yearOfManufacture, String frameNumber, String engineNumber, String seaOfControl, Integer seats,
			Integer idAccount, Integer statusInformationCar, Date created_at_InformationCar) {
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
		this.idAccount = idAccount;
		this.statusInformationCar = statusInformationCar;
		this.created_at_InformationCar = created_at_InformationCar;
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
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
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
	
	
}
