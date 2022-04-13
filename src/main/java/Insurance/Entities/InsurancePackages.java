package Insurance.Entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "InsurancePackages")
public class InsurancePackages {
	@Id
	@Column(name = "idPackage")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPackage;
	@NotEmpty(message = "Name Package is emplty")
	@Column(name = "namePackage")
	private String namePackage;
	@NotEmpty(message = "Name Package is emplty")
	@Column(name = "imagePackage")
	private String imagePackage;
	@Column(name = "statusPackage")
	private Integer statusPackage;
	@Column(name = "created_at_Package")
	private Date created_at_Package;

	@OneToMany(mappedBy = "objInsurancePackages_Order")
	private Set<OrderInsurance> listInsurancePackages_Order;

	@OneToMany(mappedBy = "objDetailPackage")
	private Set<DetailPackage> listDetailPackage_Order;

	public InsurancePackages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsurancePackages(int idPackage, @NotEmpty(message = "Name Package is emplty") String namePackage,
			@NotEmpty(message = "Name Package is emplty") String imagePackage, Integer statusPackage,
			Date created_at_Package, Set<OrderInsurance> listInsurancePackages_Order,
			Set<DetailPackage> listDetailPackage_Order) {
		super();
		this.idPackage = idPackage;
		this.namePackage = namePackage;
		this.imagePackage = imagePackage;
		this.statusPackage = statusPackage;
		this.created_at_Package = created_at_Package;
		this.listInsurancePackages_Order = listInsurancePackages_Order;
		this.listDetailPackage_Order = listDetailPackage_Order;
	}

	public int getIdPackage() {
		return idPackage;
	}

	public void setIdPackage(int idPackage) {
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

	public Set<OrderInsurance> getListInsurancePackages_Order() {
		return listInsurancePackages_Order;
	}

	public void setListInsurancePackages_Order(Set<OrderInsurance> listInsurancePackages_Order) {
		this.listInsurancePackages_Order = listInsurancePackages_Order;
	}

	public Set<DetailPackage> getListDetailPackage_Order() {
		return listDetailPackage_Order;
	}

	public void setListDetailPackage_Order(Set<DetailPackage> listDetailPackage_Order) {
		this.listDetailPackage_Order = listDetailPackage_Order;
	}

}
