package top.jalo.demo.qcs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author JALO
 *
 */
@Entity
@Table(name = "qcs_car_film")
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class CarFilmEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 20, nullable = false)
	private Long id;
	
	@Column(name = "number_plate", length = 100, nullable = false)
	private String numberPlate;
	
	@Column(name = "model", length = 100)
	private String model;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "process_date")
	private Date processDate;
	
	@Column(name = "quality_assurance_card_no", length = 100, nullable = false)
	private String qualityAssuranceCardNo;
	
	@Column(name = "process_company")
	private String processCompany;
	
	@Column(name = "create_user_id", length = 20)
	private Long createUserId;
	
	@CreatedDate
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "update_user_id", length = 20)
	private Long updateUserId;
	
	@LastModifiedDate
	@Column(name = "update_time")
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
}
