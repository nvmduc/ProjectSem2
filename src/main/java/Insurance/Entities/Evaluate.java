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

@Entity
@Table(name = "Evaluate")
public class Evaluate {
	@Id
	@Column(name = "idEvaluate")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvaluate;
	@NotEmpty(message = "Content Evaluate is emplty")
	@Column(name = "contentEvaluate")
	private String contentEvaluate;
	@Column(name = "statusEvaluate")
	private Integer statusEvaluate;
	@Column(name = "created_at_Evaluate")
	private Date created_at_Evaluate;

	@ManyToOne
	@JoinColumn(name = "idAccount", referencedColumnName = "idAccount")
	private Account objEvaluate;

	public Evaluate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evaluate(int idEvaluate, @NotEmpty(message = "Content Evaluate is emplty") String contentEvaluate,
			Integer statusEvaluate, Date created_at_Evaluate, Account objEvaluate) {
		super();
		this.idEvaluate = idEvaluate;
		this.contentEvaluate = contentEvaluate;
		this.statusEvaluate = statusEvaluate;
		this.created_at_Evaluate = created_at_Evaluate;
		this.objEvaluate = objEvaluate;
	}

	public int getIdEvaluate() {
		return idEvaluate;
	}

	public void setIdEvaluate(int idEvaluate) {
		this.idEvaluate = idEvaluate;
	}

	public String getContentEvaluate() {
		return contentEvaluate;
	}

	public void setContentEvaluate(String contentEvaluate) {
		this.contentEvaluate = contentEvaluate;
	}

	public Integer getStatusEvaluate() {
		return statusEvaluate;
	}

	public void setStatusEvaluate(Integer statusEvaluate) {
		this.statusEvaluate = statusEvaluate;
	}

	public Date getCreated_at_Evaluate() {
		return created_at_Evaluate;
	}

	public void setCreated_at_Evaluate(Date created_at_Evaluate) {
		this.created_at_Evaluate = created_at_Evaluate;
	}

	public Account getObjEvaluate() {
		return objEvaluate;
	}

	public void setObjEvaluate(Account objEvaluate) {
		this.objEvaluate = objEvaluate;
	}

}
