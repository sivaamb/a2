package com.ctel.bpcl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bpcl_sto_detail")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4328970397168047725L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "sto_id")
	private Long stoId;

	@Column(name = "batch_no")
	private String batchNo;

	@Column(name = "prod_code")
	private String prodCode;

	@Column(name = "prod_name")
	private String prodName;

	@Column(name = "prod_size")
	private String prodSize;

	@Column(name = "pack_type")
	private String packType;

	@Column(name = "indent_qty")
	private Integer indentQty;

	@Column(name = "appr_qty")
	private Integer apprQty;

	@Column(name = "req_qty_prt")
	private Integer reqQtyPrt;

	@Column(name = "appr_qty_prt")
	private Integer apprQtyPrt;

	@Column(name = "upc")
	private Integer upc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStoId() {
		return stoId;
	}

	public void setStoId(Long stoId) {
		this.stoId = stoId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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

	public Integer getIndentQty() {
		return indentQty;
	}

	public void setIndentQty(Integer indentQty) {
		this.indentQty = indentQty;
	}

	public Integer getApprQty() {
		return apprQty;
	}

	public void setApprQty(Integer apprQty) {
		this.apprQty = apprQty;
	}

	public Integer getReqQtyPrt() {
		return reqQtyPrt;
	}

	public void setReqQtyPrt(Integer reqQtyPrt) {
		this.reqQtyPrt = reqQtyPrt;
	}

	public Integer getApprQtyPrt() {
		return apprQtyPrt;
	}

	public void setApprQtyPrt(Integer apprQtyPrt) {
		this.apprQtyPrt = apprQtyPrt;
	}

	public Integer getUpc() {
		return upc;
	}

	public void setUpc(Integer upc) {
		this.upc = upc;
	}

}
