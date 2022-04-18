package Insurance.DTO;

import java.util.Date;

public class DetailPackageDTO {
	private Integer idDetailPackage;
	private Integer idPackage;
	private String descriptionPackage;
	private Float insuranceFees;
	private Float compensation;
	private Integer status;
	private Date created_at;
	public DetailPackageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetailPackageDTO(Integer idDetailPackage, Integer idPackage, String descriptionPackage, Float insuranceFees,
			Float compensation, Integer status, Date created_at) {
		super();
		this.idDetailPackage = idDetailPackage;
		this.idPackage = idPackage;
		this.descriptionPackage = descriptionPackage;
		this.insuranceFees = insuranceFees;
		this.compensation = compensation;
		this.status = status;
		this.created_at = created_at;
	}
	public Integer getIdDetailPackage() {
		return idDetailPackage;
	}
	public void setIdDetailPackage(Integer idDetailPackage) {
		this.idDetailPackage = idDetailPackage;
	}
	public Integer getIdPackage() {
		return idPackage;
	}
	public void setIdPackage(Integer idPackage) {
		this.idPackage = idPackage;
	}
	public String getDescriptionPackage() {
		return descriptionPackage;
	}
	public void setDescriptionPackage(String descriptionPackage) {
		this.descriptionPackage = descriptionPackage;
	}
	public Float getInsuranceFees() {
		return insuranceFees;
	}
	public void setInsuranceFees(Float insuranceFees) {
		this.insuranceFees = insuranceFees;
	}
	public Float getCompensation() {
		return compensation;
	}
	public void setCompensation(Float compensation) {
		this.compensation = compensation;
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
