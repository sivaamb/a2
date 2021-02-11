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

/**
 * 
 * @author Gowtham
 *
 */
@Entity
@Table(name = "bpcl_coupons")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coupons implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5811479053309425665L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id=0L;

	@Column(name = "loc_code")
	private String locCode;

	@Column(name = "scheme_date")
	private Timestamp schemeDate;

	@Column(name = "scheme_validaty")
	private Timestamp schemeValidaty;

	@Column(name = "coupon_bacth_no")
	private String couponBacthNo;

	@Column(name = "batch_qty")
	private Long batchQty=0L;

	@Column(name = "printed_qty")
	private Long printedQty=0L;

	@Column(name = "used_qty")
	private Long usedQty=0L;

	@Column(name = "closeing_qty")
	private Long closeingQty=0L;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "created_by")
	private Integer createdBy;

	@Column(name = "status")
	private String status;
	
	
	@Transient
	private List<CouponsDetails> couponsDetails;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLocCode() {
		return locCode;
	}


	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}


	public Timestamp getSchemeDate() {
		return schemeDate;
	}


	public void setSchemeDate(Timestamp schemeDate) {
		this.schemeDate = schemeDate;
	}


	public Timestamp getSchemeValidaty() {
		return schemeValidaty;
	}


	public void setSchemeValidaty(Timestamp schemeValidaty) {
		this.schemeValidaty = schemeValidaty;
	}


	public String getCouponBacthNo() {
		return couponBacthNo;
	}


	public void setCouponBacthNo(String couponBacthNo) {
		this.couponBacthNo = couponBacthNo;
	}


	public Long getBatchQty() {
		return batchQty;
	}


	public void setBatchQty(Long batchQty) {
		this.batchQty = batchQty;
	}


	public Long getPrintedQty() {
		return printedQty;
	}


	public void setPrintedQty(Long printedQty) {
		this.printedQty = printedQty;
	}


	public Long getUsedQty() {
		return usedQty;
	}


	public void setUsedQty(Long usedQty) {
		this.usedQty = usedQty;
	}


	public Long getCloseingQty() {
		return closeingQty;
	}


	public void setCloseingQty(Long closeingQty) {
		this.closeingQty = closeingQty;
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


	public List<CouponsDetails> getCouponsDetails() {
		return couponsDetails;
	}


	public void setCouponsDetails(List<CouponsDetails> couponsDetails) {
		this.couponsDetails = couponsDetails;
	}


	 
	 

}
