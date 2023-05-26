package com.HG.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private Integer cid;
	private String customerid;
	private String customername;
	private String cust_user_id;
	private String cust_create_id;
	private String cust_source;
	private String cust_industry;
	private String cust_phone;
	private String cust_mobile;
	private String cust_address;
	private String cust_createdate;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(String cust_user_id) {
		this.cust_user_id = cust_user_id;
	}
	public String getCust_create_id() {
		return cust_create_id;
	}
	public void setCust_create_id(String cust_create_id) {
		this.cust_create_id = cust_create_id;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_createdate() {
		return cust_createdate;
	}
	public void setCust_createdate(String cust_createdate) {
		this.cust_createdate = cust_createdate;
	}
	public Customer(Integer cid, String customerid, String customername, String cust_user_id, String cust_create_id,
			String cust_source, String cust_industry, String cust_phone, String cust_mobile, String cust_address,
			String cust_createdate) {
		super();
		this.cid = cid;
		this.customerid = customerid;
		this.customername = customername;
		this.cust_user_id = cust_user_id;
		this.cust_create_id = cust_create_id;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_address = cust_address;
		this.cust_createdate = cust_createdate;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", customerid=" + customerid + ", customername=" + customername
				+ ", cust_user_id=" + cust_user_id + ", cust_create_id=" + cust_create_id + ", cust_source="
				+ cust_source + ", cust_industry=" + cust_industry + ", cust_phone=" + cust_phone + ", cust_mobile="
				+ cust_mobile + ", cust_address=" + cust_address + ", cust_createdate=" + cust_createdate + "]";
	}
	
	
}
