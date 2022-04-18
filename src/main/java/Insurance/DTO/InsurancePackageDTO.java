package Insurance.DTO;

import java.util.Date;

public class InsurancePackageDTO {
	private Integer idPackage;
	private String namePackage;
	private String imagePackage;
	private Integer statusPackage;
	private Date created_at_Package;
	public InsurancePackageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsurancePackageDTO(Integer idPackage, String namePackage, String imagePackage, Integer statusPackage,
			Date created_at_Package) {
		super();
		this.idPackage = idPackage;
		this.namePackage = namePackage;
		this.imagePackage = imagePackage;
		this.statusPackage = statusPackage;
		this.created_at_Package = created_at_Package;
	}
	public Integer getIdPackage() {
		return idPackage;
	}
	public void setIdPackage(Integer idPackage) {
		this.idPackage = idPackage;
	}
	public String getNamePackage() {
		return namePackage;
	}
	public void setNamePackage(String namePackage) {
		this.namePackage = namePackage;
	}
	public String getImagePackage() {
		return imagePackage;
	}
	public void setImagePackage(String imagePackage) {
		this.imagePackage = imagePackage;
	}
	public Integer getStatusPackage() {
		return statusPackage;
	}
	public void setStatusPackage(Integer statusPackage) {
		this.statusPackage = statusPackage;
	}
	public Date getCreated_at_Package() {
		return created_at_Package;
	}
	public void setCreated_at_Package(Date created_at_Package) {
		this.created_at_Package = created_at_Package;
	}
	
}
