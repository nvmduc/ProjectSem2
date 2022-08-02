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
@Table(name = "Account")
public class Account {
	@Id
	@Column(name = "idAccount")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAccount;
	@NotEmpty(message = "Name is emplty")
	@Column(name = "name")
	private String name;
	@NotEmpty(message = "Email is emplty")
	@Column(name = "email")
	private String email;
	@NotEmpty(message = "Password is emplty")
	@Column(name = "password")
	private String password;
	@Column(name = "phone")
	private String phone;
	@Column(name = "avatar")
	private String avatar;
	@NotNull(message = "Birth Day is not null")
	@Column(name = "birthDay")
	private Date birthDay;
	@NotEmpty(message = "City is not emplty")
	@Column(name = "city")
	private String city;
	@NotEmpty(message = "District is not emplty")
	@Column(name = "district")
	private String district;
	@NotEmpty(message = "Wards is not emplty")
	@Column(name = "wards")
	private String wards;
	@NotEmpty(message = "Street is not emplty")
	@Column(name = "street")
	private String street;
	@NotEmpty(message = "ApartmentNumber is not emplty")
	@Column(name = "apartmentNumber")
	private String apartmentNumber;
	@NotEmpty(message = "Zipcode is not emplty")
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "role")
	private Integer role;
	@Column(name = "statusAccount")
	private Integer statusAccount;
	@Column(name = "created_at_Account")
	private Date created_at_Account;
	
	@OneToMany(mappedBy = "objAccount_InformationCar")
	private Set<InformationCar> listAccount_InformationCar;

	@OneToMany(mappedBy = "objAccount_OrderInsurance")
	private Set<OrderInsurance> listAccount_OrderInsurance;

	@OneToMany(mappedBy = "objAccount_Contract")
	private Set<ContractInsurance> listAccount_Contract;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer idAccount, @NotEmpty(message = "Name is emplty") String name,
			@NotEmpty(message = "Email is emplty") String email,
			@NotEmpty(message = "Password is emplty") String password, String phone, String avatar,
			@NotNull(message = "Birth Day is not null") Date birthDay,
			@NotEmpty(message = "City is not emplty") String city,
			@NotEmpty(message = "District is not emplty") String district,
			@NotEmpty(message = "Wards is not emplty") String wards,
			@NotEmpty(message = "Street is not emplty") String street,
			@NotEmpty(message = "ApartmentNumber is not emplty") String apartmentNumber,
			@NotEmpty(message = "Zipcode is not emplty") String zipcode, Integer role, Integer statusAccount,
			Date created_at_Account, Set<InformationCar> listAccount_InformationCar,
			Set<OrderInsurance> listAccount_OrderInsurance, Set<ContractInsurance> listAccount_Contract) {
		super();
		this.idAccount = idAccount;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.avatar = avatar;
		this.birthDay = birthDay;
		this.city = city;
		this.district = district;
		this.wards = wards;
		this.street = street;
		this.apartmentNumber = apartmentNumber;
		this.zipcode = zipcode;
		this.role = role;
		this.statusAccount = statusAccount;
		this.created_at_Account = created_at_Account;
		this.listAccount_InformationCar = listAccount_InformationCar;
		this.listAccount_OrderInsurance = listAccount_OrderInsurance;
		this.listAccount_Contract = listAccount_Contract;
	}

	public Integer getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWards() {
		return wards;
	}

	public void setWards(String wards) {
		this.wards = wards;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getStatusAccount() {
		return statusAccount;
	}

	public void setStatusAccount(Integer statusAccount) {
		this.statusAccount = statusAccount;
	}

	public Date getCreated_at_Account() {
		return created_at_Account;
	}

	public void setCreated_at_Account(Date created_at_Account) {
		this.created_at_Account = created_at_Account;
	}

	public Set<InformationCar> getListAccount_InformationCar() {
		return listAccount_InformationCar;
	}

	public void setListAccount_InformationCar(Set<InformationCar> listAccount_InformationCar) {
		this.listAccount_InformationCar = listAccount_InformationCar;
	}

	public Set<OrderInsurance> getListAccount_OrderInsurance() {
		return listAccount_OrderInsurance;
	}

	public void setListAccount_OrderInsurance(Set<OrderInsurance> listAccount_OrderInsurance) {
		this.listAccount_OrderInsurance = listAccount_OrderInsurance;
	}

	public Set<ContractInsurance> getListAccount_Contract() {
		return listAccount_Contract;
	}

	public void setListAccount_Contract(Set<ContractInsurance> listAccount_Contract) {
		this.listAccount_Contract = listAccount_Contract;
	}
	
}
