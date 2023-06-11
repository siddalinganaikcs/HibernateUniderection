package com.onetoone.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pan_Id;
	private String pan_Name;
	private String pan_No;
	private String pan_Address;
	public int getPan_Id() {
		return pan_Id;
	}
	public void setPan_Id(int pan_Id) {
		this.pan_Id = pan_Id;
	}
	public String getPan_Name() {
		return pan_Name;
	}
	public void setPan_Name(String pan_Name) {
		this.pan_Name = pan_Name;
	}
	public String getPan_No() {
		return pan_No;
	}
	public void setPan_No(String pan_No) {
		this.pan_No = pan_No;
	}
	public String getPan_Address() {
		return pan_Address;
	}
	public void setPan_Address(String pan_Address) {
		this.pan_Address = pan_Address;
	}
	@Override
	public String toString() {
		return "PanCard [pan_Id=" + pan_Id + ", pan_Name=" + pan_Name + ", pan_No=" + pan_No + ", pan_Address="
				+ pan_Address + "]";
	}
	


}
