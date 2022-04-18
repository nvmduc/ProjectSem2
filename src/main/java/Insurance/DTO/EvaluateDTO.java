package Insurance.DTO;

import java.util.Date;

public class EvaluateDTO {
	private Integer idEvaluate;
	private Integer idAccount;
	private String contentEvaluate;
	private Integer statusEvaluate;
	private Date created_at_Evaluate;
	public EvaluateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvaluateDTO(Integer idEvaluate, Integer idAccount, String contentEvaluate, Integer statusEvaluate,
			Date created_at_Evaluate) {
		super();
		this.idEvaluate = idEvaluate;
		this.idAccount = idAccount;
		this.contentEvaluate = contentEvaluate;
		this.statusEvaluate = statusEvaluate;
		this.created_at_Evaluate = created_at_Evaluate;
	}
	public Integer getIdEvaluate() {
		return idEvaluate;
	}
	public void setIdEvaluate(Integer idEvaluate) {
		this.idEvaluate = idEvaluate;
	}
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
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
	
}
