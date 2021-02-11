package com.ctel.bpcl.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bpcl_sto")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1953345777203776671L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "ord_date")
	private Timestamp ordDate;

	@Column(name = "ord_no")
	private String ordNo;

	@Column(name = "cust_no")
	private String custNo;

	@Column(name = "ref_date")
	private Timestamp refDate;

	@Column(name = "ref_no")
	private String refNo;

	@Column(name = "src_loc_code")
	private String srcLocCode;

	@Column(name = "src_loc_name")
	private String srcLocName;

	@Column(name = "dest_loc_code")
	private String destLocCode;

	@Column(name = "dest_loc_name")
	private String destLocName;

	@Column(name = "proc_by")
	private Integer procBy;

	@Column(name = "proc_on")
	private Timestamp procOn;

	@Column(name = "appr_by")
	private Integer apprBy;

	@Column(name = "appr_on")
	private Timestamp apprOn;

	@Column(name = "src_add_id")
	private Long srcAddId;

	@Column(name = "dest_add_id")
	private Long destAddId;

	@Column(name = "purpose")
	private Integer purpose;

	@Column(name = "eway_bill_no")
	private String ewayBillNo;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "created_by")
	private Integer createdBy;

	@Column(name = "status")
	private String status;
	
	
	@Transient
	private List<StoDetail> stoDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Timestamp ordDate) {
		this.ordDate = ordDate;
	}

	public String getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public Timestamp getRefDate() {
		return refDate;
	}

	public void setRefDate(Timestamp refDate) {
		this.refDate = refDate;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getSrcLocCode() {
		return srcLocCode;
	}

	public void setSrcLocCode(String srcLocCode) {
		this.srcLocCode = srcLocCode;
	}

	public String getSrcLocName() {
		return srcLocName;
	}

	public void setSrcLocName(String srcLocName) {
		this.srcLocName = srcLocName;
	}

	public String getDestLocCode() {
		return destLocCode;
	}

	public void setDestLocCode(String destLocCode) {
		this.destLocCode = destLocCode;
	}

	public String getDestLocName() {
		return destLocName;
	}

	public void setDestLocName(String destLocName) {
		this.destLocName = destLocName;
	}

	public Integer getProcBy() {
		return procBy;
	}

	public void setProcBy(Integer procBy) {
		this.procBy = procBy;
	}

	public Timestamp getProcOn() {
		return procOn;
	}

	public void setProcOn(Timestamp procOn) {
		this.procOn = procOn;
	}

	public Integer getApprBy() {
		return apprBy;
	}

	public void setApprBy(Integer apprBy) {
		this.apprBy = apprBy;
	}

	public Timestamp getApprOn() {
		return apprOn;
	}

	public void setApprOn(Timestamp apprOn) {
		this.apprOn = apprOn;
	}

	public Long getSrcAddId() {
		return srcAddId;
	}

	public void setSrcAddId(Long srcAddId) {
		this.srcAddId = srcAddId;
	}

	public Long getDestAddId() {
		return destAddId;
	}

	public void setDestAddId(Long destAddId) {
		this.destAddId = destAddId;
	}

	public Integer getPurpose() {
		return purpose;
	}

	public void setPurpose(Integer purpose) {
		this.purpose = purpose;
	}

	public String getEwayBillNo() {
		return ewayBillNo;
	}

	public void setEwayBillNo(String ewayBillNo) {
		this.ewayBillNo = ewayBillNo;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<StoDetail> getStoDetails() {
		return stoDetails;
	}

	public void setStoDetails(List<StoDetail> stoDetails) {
		this.stoDetails = stoDetails;
	}
	
	
	

}
