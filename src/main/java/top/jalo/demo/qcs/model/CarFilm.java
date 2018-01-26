package top.jalo.demo.qcs.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author JALO
 *
 */
public class CarFilm {
	
	private Long id;
	
	private String numberPlate;
	
	private String model;
	
	private String position;
	
	private Date processDate;
	
	private String qualityAssuranceCardNo;
	
	private String processCompany;
	
	private Long createUserId;
	
	private Date createTime;
	
	private Long updateUserId;
	
	private Date updateTime;

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public String getQualityAssuranceCardNo() {
		return qualityAssuranceCardNo;
	}

	public void setQualityAssuranceCardNo(String qualityAssuranceCardNo) {
		this.qualityAssuranceCardNo = qualityAssuranceCardNo;
	}

	public String getProcessCompany() {
		return processCompany;
	}

	public void setProcessCompany(String processCompany) {
		this.processCompany = processCompany;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CarFilm [id=" + id + ", numberPlate=" + numberPlate + ", model=" + model + ", position=" + position
				+ ", processDate=" + processDate + ", qualityAssuranceCardNo=" + qualityAssuranceCardNo
				+ ", processCompany=" + processCompany + ", createUserId=" + createUserId + ", createTime=" + createTime
				+ ", updateUserId=" + updateUserId + ", updateTime=" + updateTime + "]";
	}
}
