package com.onetoone.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int person_Id;
	private String person_Name;
	private String person_Gender;
	private int person_Age;
	private int person_Phno;
	@OneToOne
	private PanCard pan;
	public int getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	public String getPerson_Gender() {
		return person_Gender;
	}
	public void setPerson_Gender(String person_Gender) {
		this.person_Gender = person_Gender;
	}
	public int getPerson_Age() {
		return person_Age;
	}
	public void setPerson_Age(int person_Age) {
		this.person_Age = person_Age;
	}
	public int getPerson_Phno() {
		return person_Phno;
	}
	public void setPerson_Phno(int person_Phno) {
		this.person_Phno = person_Phno;
	}
	public PanCard getPan() {
		return pan;
	}
	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Person [person_Id=" + person_Id + ", person_Name=" + person_Name + ", person_Gender=" + person_Gender
				+ ", person_Age=" + person_Age + ", person_Phno=" + person_Phno + ", pan=" + pan + "]";
	}
	

}
