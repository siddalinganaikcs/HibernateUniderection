package com.onetomany.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banks 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bank_Id;
	private String bank_Name;
	private String bank_Addess;
	private String bank_IfscNo;
	@Override
	public String toString() {
		return "Banks [bank_Id=" + bank_Id + ", bank_Name=" + bank_Name + ", bank_Addess=" + bank_Addess
				+ ", bank_IfscNo=" + bank_IfscNo + "]";
	}
	public int getBank_Id() {
		return bank_Id;
	}
	public void setBank_Id(int bank_Id) {
		this.bank_Id = bank_Id;
	}
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getBank_Addess() {
		return bank_Addess;
	}
	public void setBank_Addess(String bank_Addess) {
		this.bank_Addess = bank_Addess;
	}
	public String getBank_IfscNo() {
		return bank_IfscNo;
	}
	public void setBank_IfscNo(String bank_IfscNo) {
		this.bank_IfscNo = bank_IfscNo;
	}
	
	
}
