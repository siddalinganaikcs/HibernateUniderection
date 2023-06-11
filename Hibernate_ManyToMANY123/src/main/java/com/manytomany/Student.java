package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int stu_Id;
  private String stu_Name;
  private String stu_Gender;
  private int stu_Marks;
  private long stu_Phno;
  
  @ManyToMany
  private List<Course> course;

public int getStu_Id() {
	return stu_Id;
}

public void setStu_Id(int stu_Id) {
	this.stu_Id = stu_Id;
}

public String getStu_Name() {
	return stu_Name;
}

public void setStu_Name(String stu_Name) {
	this.stu_Name = stu_Name;
}

public String getStu_Gender() {
	return stu_Gender;
}

public void setStu_Gender(String stu_Gender) {
	this.stu_Gender = stu_Gender;
}

public int getStu_Marks() {
	return stu_Marks;
}

public void setStu_Marks(int stu_Marks) {
	this.stu_Marks = stu_Marks;
}

public long getStu_Phno() {
	return stu_Phno;
}

public void setStu_Phno(long stu_Phno) {
	this.stu_Phno = stu_Phno;
}

public List<Course> getCourse() {
	return course;
}

public void setCourse(List<Course> course) {
	this.course = course;
}

@Override
public String toString() {
	return "Student [stu_Id=" + stu_Id + ", stu_Name=" + stu_Name + ", stu_Gender=" + stu_Gender + ", stu_Marks="
			+ stu_Marks + ", stu_Phno=" + stu_Phno + ", course=" + course + "]";
}
 
  
}
