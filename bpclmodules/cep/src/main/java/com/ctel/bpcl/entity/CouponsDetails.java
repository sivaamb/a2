package com.ctel.bpcl.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bpcl_coupons_details")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CouponsDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8215953719443507842L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "loc_code")
	private String locCode;

	@Column(name = "coupons_id")
	private Long couponsId;
	
	@Column(name = "coupon_no")
	private String couponNo;

	@Column(name = "coupons_production_id")
	private Long couponsProductionId = 0L;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "status")
	private String status;

//	@ManyToOne
//    @JoinColumn(name = "coupons_id",nullable = false)
//	private BpclCoupons bpclCoupons;

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

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public Long getCouponsProductionId() {
		return couponsProductionId;
	}

	public void setCouponsProductionId(Long couponsProductionId) {
		this.couponsProductionId = couponsProductionId;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCouponsId() {
		return couponsId;
	}

	public void setCouponsId(Long couponsId) {
		this.couponsId = couponsId;
	}
	
	

//	public BpclCoupons getBpclCoupons() {
//		return bpclCoupons;
//	}
//
//	public void setBpclCoupons(BpclCoupons bpclCoupons) {
//		this.bpclCoupons = bpclCoupons;
//	}
	 
}
