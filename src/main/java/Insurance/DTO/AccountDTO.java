package Insurance.DTO;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AccountDTO {
	private Integer idAccount;
	@NotEmpty(message = "Name is emplty")
	private String name;
	@NotEmpty(message = "Email is emplty")
	private String email;
	@NotEmpty(message = "Password is emplty")
	private String password;
	@NotEmpty(message = "Phone is not null")
	private String phone;
	private String avatar;
	@NotNull(message = "Birth Day is not null")
	private Date birthDay;
	@NotEmpty(message = "City is not emplty")
	private String city;
	@NotEmpty(message = "District is not emplty")
	private String district;
	@NotEmpty(message = "Wards is not emplty")
	private String wards;
	@NotEmpty(message = "Street is not emplty")
	private String street;
	@NotEmpty(message = "ApartmentNumber is not emplty")
	private String apartmentNumber;
	@NotEmpty(message = "Zipcode is not emplty")
	private String zipcode;
	private Integer statusAccount;
	private Date created_at_Account;
	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDTO(Integer idAccount, @NotEmpty(message = "Name is emplty") String name,
			@NotEmpty(message = "Email is emplty") String email,
			@NotEmpty(message = "Password is emplty") String password,
			@NotEmpty(message = "Phone is not null") String phone, String avatar,
			@NotNull(message = "Birth Day is not null") Date birthDay,
			@NotEmpty(message = "City is not emplty") String city,
			@NotEmpty(message = "District is not emplty") String district,
			@NotEmpty(message = "Wards is not emplty") String wards,
			@NotEmpty(message = "Street is not emplty") String street,
			@NotEmpty(message = "ApartmentNumber is not emplty") String apartmentNumber,
			@NotEmpty(message = "Zipcode is not emplty") String zipcode, Integer statusAccount,
			Date created_at_Account) {
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
		this.statusAccount = statusAccount;
		this.created_at_Account = created_at_Account;
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
	
	
}
