package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int country_Id;
	private String country_Name;
	private String country_PM;
	private String country_Capital;
	public int getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public String getCountry_PM() {
		return country_PM;
	}
	public void setCountry_PM(String country_PM) {
		this.country_PM = country_PM;
	}
	public String getCountry_Capital() {
		return country_Capital;
	}
	public void setCountry_Capital(String country_Capital) {
		this.country_Capital = country_Capital;
	}
	@Override
	public String toString() {
		return "Country [country_Id=" + country_Id + ", country_Name=" + country_Name + ", country_PM=" + country_PM
				+ ", country_Capital=" + country_Capital + "]";
	}
	
	
	

}
