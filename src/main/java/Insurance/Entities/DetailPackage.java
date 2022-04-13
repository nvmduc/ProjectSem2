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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DetailPackage")
public class DetailPackage {
	@Id
	@Column(name = "idDetailPackage")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetailPackage;
	@NotEmpty(message = "Description Package is emplty")
	@Column(name = "descriptionPackage")
	private String descriptionPackage;
	@NotNull(message = "Insurance Fees is emplty")
	@Column(name = "insuranceFees")
	private Float insuranceFees;
	@NotNull(message = "Compensation is emplty")
	@Column(name = "compensation")
	private Float compensation;
	@Column(name = "status")
	private Integer status;
	@Column(name = "created_at")
	private Date created_at;

	@ManyToOne
	@JoinColumn(name = "idPackage", referencedColumnName = "idPackage")
	private InsurancePackages objInformation_Detail;

	public DetailPackage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetailPackage(int idDetailPackage,
			@NotEmpty(message = "Description Package is emplty") String descriptionPackage,
			@NotNull(message = "Insurance Fees is emplty") Float insuranceFees,
			@NotNull(message = "Compensation is emplty") Float compensation, Integer status, Date created_at,
			InsurancePackages objInformation_Detail) {
		super();
		this.idDetailPackage = idDetailPackage;
		this.descriptionPackage = descriptionPackage;
		this.insuranceFees = insuranceFees;
		this.compensation = compensation;
		this.status = status;
		this.created_at = created_at;
		this.objInformation_Detail = objInformation_Detail;
	}

	public int getIdDetailPackage() {
		return idDetailPackage;
	}

	public void setIdDetailPackage(int idDetailPackage) {
		this.idDetailPackage = idDetailPackage;
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

	public InsurancePackages getObjInformation_Detail() {
		return objInformation_Detail;
	}

	public void setObjInformation_Detail(InsurancePackages objInformation_Detail) {
		this.objInformation_Detail = objInformation_Detail;
	}

}
