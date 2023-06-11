package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dev");
        EntityManager em = emf.createEntityManager();
      EntityTransaction t = em.getTransaction();
      
      Student stu=new Student();
      stu.setStu_Gender("make");
      stu.setStu_Marks(76);
      stu.setStu_Name("sidda");
      stu.setStu_Phno(657685846473l);
      
      Student stu1=new Student();
      stu1.setStu_Gender("male");
      stu1.setStu_Marks(65);
      stu.setStu_Name("naik");
      stu1.setStu_Phno(86757595445l);
      
      Student stu2=new Student();
      stu2.setStu_Gender("male");
      stu2.setStu_Marks(98);
      stu2.setStu_Name("linga");
      stu2.setStu_Phno(65769795757l);
      
      
      
      Course course=new Course();
      course.setCour_Fees(45000);
      course.setCour_Name("java");
      course.setCour_Trainer("summaya");
      
      Course course1=new Course();
      course1.setCour_Fees(45000);
      course1.setCour_Name("sql");
      course1.setCour_Trainer("navneeth");

      
      Course course2=new Course();
      course2.setCour_Fees(45000);
      course2.setCour_Name("advance java");
      course2.setCour_Trainer("nagabhushan");

      
      Course course3=new Course();
      course3.setCour_Fees(45000);
      course3.setCour_Name("javascript");
      course3.setCour_Trainer("syde");
      
      
      List<Course> list =new ArrayList<Course>();
      list.add(course);
      list.add(course2);
      list.add(course3);
     
      List<Course> list1 =new ArrayList<Course>();
      list1.add(course2);
      list1.add(course3);
      list1.add(course1);
      
      List<Course> list2 =new ArrayList<Course>();
      list2.add(course1);
      list2.add(course2);
      list2.add(course3);
      
      stu.setCourse(list);
      stu.setCourse(list1);
      stu.setCourse(list2);
      
      t.begin();
      em.persist(stu);
      em.persist(stu1);
      em.persist(stu2);
      em.persist(course);
      em.persist(course1);
      em.persist(course2);
      em.persist(course3);
      t.commit();


	}

}
