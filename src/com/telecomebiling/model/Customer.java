package com.telecomebiling.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Telecome_Billing")
public class Customer implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	private Integer customer_Id;
	
	@Column(name="CUSTOMER_NAME")
	private String customer_Name;
	
	@Column(name="CUSTOMER_ADDRESS")
	private String customer_Address;
	
	@Column(name="CUSTOMER_MOBILENO",unique=true)
	private Long customer_MobileNo;
	
	@Column(name="CUSTOMER_AGE")
	private Integer customer_Age;
	 
	@Column(name="CUSTOMER_CREDIT")
	private Float customer_Credit;

	public Integer getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getCustomer_Address() {
		return customer_Address;
	}

	public void setCustomer_Address(String customer_Address) {
		this.customer_Address = customer_Address;
	}

	public Long getCustomer_MobileNo() {
		return customer_MobileNo;
	}

	public void setCustomer_MobileNo(Long customer_MobileNo) {
		this.customer_MobileNo = customer_MobileNo;
	}

	public Integer getCustomer_Age() {
		return customer_Age;
	}

	public void setCustomer_Age(Integer customer_Age) {
		this.customer_Age = customer_Age;
	}

	public Float getCustomer_Credit() {
		return customer_Credit;
	}

	public void setCustomer_Credit(Float customer_Credit) {
		this.customer_Credit = customer_Credit;
	}
}
