package com.onetomany.project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Customer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_Id;
	private String customer_Name;
	private String customer_Gender;
	private int customer_Age;
	private Long customer_Phno;
	@OneToMany
	private List<Banks> bank;
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCustomer_Gender() {
		return customer_Gender;
	}
	public void setCustomer_Gender(String customer_Gender) {
		this.customer_Gender = customer_Gender;
	}
	public int getCustomer_Age() {
		return customer_Age;
	}
	public void setCustomer_Age(int customer_Age) {
		this.customer_Age = customer_Age;
	}
	public Long getCustomer_Phno() {
		return customer_Phno;
	}
	public void setCustomer_Phno(Long customer_Phno) {
		this.customer_Phno = customer_Phno;
	}
	public List<Banks> getBank() {
		return bank;
	}
	public void setBank(List<Banks> bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", customer_Gender="
				+ customer_Gender + ", customer_Age=" + customer_Age + ", customer_Phno=" + customer_Phno + ", bank="
				+ bank + "]";
	}
	
	
	

}
