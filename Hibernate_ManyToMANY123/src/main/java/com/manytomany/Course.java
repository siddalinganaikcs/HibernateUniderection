package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int cour_Id;
  private String  cour_Name;
  private String  cour_Trainer;
  private double cour_Fees;
public int getCour_Id() {
	return cour_Id;
}
public void setCour_Id(int cour_Id) {
	this.cour_Id = cour_Id;
}
public String getCour_Name() {
	return cour_Name;
}
public void setCour_Name(String cour_Name) {
	this.cour_Name = cour_Name;
}
public String getCour_Trainer() {
	return cour_Trainer;
}
public void setCour_Trainer(String cour_Trainer) {
	this.cour_Trainer = cour_Trainer;
}
public double getCour_Fees() {
	return cour_Fees;
}
public void setCour_Fees(double cour_Fees) {
	this.cour_Fees = cour_Fees;
}
@Override
public String toString() {
	return "Course [cour_Id=" + cour_Id + ", cour_Name=" + cour_Name + ", cour_Trainer=" + cour_Trainer + ", cour_Fees="
			+ cour_Fees + "]";
}

  
  
 

}
