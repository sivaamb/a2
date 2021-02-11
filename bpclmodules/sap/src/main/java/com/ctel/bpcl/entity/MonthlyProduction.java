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
@Table(name = "bpcl_monthly_production")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MonthlyProduction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2371706481658227485L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "loc_code")
	private String locCode;

	@Column(name = "prod_code")
	private String prodCode;

	@Column(name = "prod_name")
	private String prodName;

	@Column(name = "prod_size")
	private String prodSize;

	@Column(name = "pack_type")
	private String packType;

	@Column(name = "qty")
	private Integer qty;

	@Column(name = "mrp")
	private String mrp;

	@Column(name = "mrp_batch_no")
	private String mrpBatchNo;

	@Column(name = "prod_batch_no")
	private String prodBatchNo;

	@Column(name = "prod_litrature_url")
	private String prodLitratureUrl;

	@Column(name = "production_month")
	private String productionMonth;

	@Column(name = "created_on")
	private Timestamp createdOn;

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

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdSize() {
		return prodSize;
	}

	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getMrpBatchNo() {
		return mrpBatchNo;
	}

	public void setMrpBatchNo(String mrpBatchNo) {
		this.mrpBatchNo = mrpBatchNo;
	}

	public String getProdBatchNo() {
		return prodBatchNo;
	}

	public void setProdBatchNo(String prodBatchNo) {
		this.prodBatchNo = prodBatchNo;
	}

	public String getProdLitratureUrl() {
		return prodLitratureUrl;
	}

	public void setProdLitratureUrl(String prodLitratureUrl) {
		this.prodLitratureUrl = prodLitratureUrl;
	}

	public String getProductionMonth() {
		return productionMonth;
	}

	public void setProductionMonth(String productionMonth) {
		this.productionMonth = productionMonth;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	
	
	

}
