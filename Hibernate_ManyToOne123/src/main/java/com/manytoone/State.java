package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int state_Id;
  private String state_Name;
  private String state_CM;
  private String state_Capital;
  private String state_Laungauge;
  
  @ManyToOne
  private Country country;

public int getState_Id() {
	return state_Id;
}

public void setState_Id(int state_Id) {
	this.state_Id = state_Id;
}

public String getState_Name() {
	return state_Name;
}

public void setState_Name(String state_Name) {
	this.state_Name = state_Name;
}

public String getState_CM() {
	return state_CM;
}

public void setState_CM(String state_CM) {
	this.state_CM = state_CM;
}

public String getState_Capital() {
	return state_Capital;
}

public void setState_Capital(String state_Capital) {
	this.state_Capital = state_Capital;
}

public String getState_Laungauge() {
	return state_Laungauge;
}

public void setState_Laungauge(String state_Laungauge) {
	this.state_Laungauge = state_Laungauge;
}

public Country getCountry() {
	return country;
}

public void setCountry(Country country) {
	this.country = country;
}

@Override
public String toString() {
	return "State [state_Id=" + state_Id + ", state_Name=" + state_Name + ", state_CM=" + state_CM + ", state_Capital="
			+ state_Capital + ", state_Laungauge=" + state_Laungauge + ", country=" + country + "]";
}
  
  
  
}
