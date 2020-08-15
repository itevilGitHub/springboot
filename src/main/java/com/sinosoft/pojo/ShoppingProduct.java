package com.sinosoft.pojo;

import java.math.BigDecimal;
import java.sql.Date;

public class ShoppingProduct {
	//产品编号
	private String productNo;
	//产品代码
	private String productCode;
	//产品名称
	private String productName;
	//产品单价
	private BigDecimal productValue;
	//产品成本
	private BigDecimal productCost;
	//产品类型
	private String productType;
	//产品描述
	private String productDesc;
	//商户id
	private String supplyNo;
	//产品库存
	private BigDecimal productRemainedNum;
	//图片地址
	private String productAddress;
	//创建时间
	private Date created;
	//创建人
	private String createdBy;
	//更新时间
	private Date updated;
	//更新人
	private String updatedBy;
	
	

	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getProductValue() {
		return productValue;
	}
	public void setProductValue(BigDecimal productValue) {
		this.productValue = productValue;
	}
	public BigDecimal getProductCost() {
		return productCost;
	}
	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getSupplyNo() {
		return supplyNo;
	}
	public void setSupplyNo(String supplyNo) {
		this.supplyNo = supplyNo;
	}
	public BigDecimal getProductRemainedNum() {
		return productRemainedNum;
	}
	public void setProductRemainedNum(BigDecimal productRemainedNum) {
		this.productRemainedNum = productRemainedNum;
	}
	public String getProductAddress() {
		return productAddress;
	}
	public void setProductAddress(String productAddress) {
		this.productAddress = productAddress;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
}
