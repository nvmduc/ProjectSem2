package Insurance.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Banner")
public class Banner {
	@Id
	@Column(name = "idBanner")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBanner;
	@NotEmpty(message = "Tittle Banner is not empty")
	@Column(name = "titleBanner")
	private String titleBanner;
	@NotEmpty(message = "Name Banner is not empty")
	@Column(name = "nameBanner")
	private String nameBanner;
	@NotEmpty(message = "imgBanner")
	@Column(name = "imgBanner")
	private String imgBanner;
	@NotEmpty(message = "Description")
	@Column(name = "description")
	private String description;
	@Column(name = "status")
	private Integer status;
	@Column(name = "created_at")
	private Date created_at;
	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banner(Integer idBanner, @NotEmpty(message = "Tittle Banner is not empty") String titleBanner,
			@NotEmpty(message = "Name Banner is not empty") String nameBanner,
			@NotEmpty(message = "imgBanner") String imgBanner, @NotEmpty(message = "Description") String description,
			Integer status, Date created_at) {
		super();
		this.idBanner = idBanner;
		this.titleBanner = titleBanner;
		this.nameBanner = nameBanner;
		this.imgBanner = imgBanner;
		this.description = description;
		this.status = status;
		this.created_at = created_at;
	}
	public Integer getIdBanner() {
		return idBanner;
	}
	public void setIdBanner(Integer idBanner) {
		this.idBanner = idBanner;
	}
	public String getTitleBanner() {
		return titleBanner;
	}
	public void setTitleBanner(String titleBanner) {
		this.titleBanner = titleBanner;
	}
	public String getNameBanner() {
		return nameBanner;
	}
	public void setNameBanner(String nameBanner) {
		this.nameBanner = nameBanner;
	}
	public String getImgBanner() {
		return imgBanner;
	}
	public void setImgBanner(String imgBanner) {
		this.imgBanner = imgBanner;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
