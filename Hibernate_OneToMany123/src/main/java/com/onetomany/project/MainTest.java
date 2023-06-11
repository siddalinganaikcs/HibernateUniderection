package com.onetomany.project;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.mapping.List;

public class MainTest {

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dev");
        EntityManager em = emf.createEntityManager();
      EntityTransaction t = em.getTransaction();
      
      
      Customer cus=new Customer();
      
      cus.setCustomer_Age(23);
      cus.setCustomer_Gender("male");
      cus.setCustomer_Name("sidda");
      cus.setCustomer_Phno(9636464894l);
      
      Customer cus1=new Customer();
      cus1.setCustomer_Age(23);
      cus1.setCustomer_Gender("male");
      cus1.setCustomer_Name("naik");
      cus1.setCustomer_Phno(6575464894l);
      
      Banks ban=new Banks();
      ban.setBank_Addess("kanakpura");
      ban.setBank_IfscNo("SBI526373");
      ban.setBank_Name("SBI");
		
      Banks ban1=new Banks();
      ban1.setBank_Addess("RAMANAGARA");
      ban1.setBank_IfscNo("CAN6476578");
      ban1.setBank_Name("CANARA BANK");

      Banks ban2=new Banks();
      ban2.setBank_Addess("BENAGLURU");
      ban2.setBank_IfscNo("HDFC77598698");
      ban2.setBank_Name("HDFC");

      Banks ban3=new Banks();
      ban3.setBank_Addess("KANAKAPURA");
      ban3.setBank_IfscNo("KAR764487");
      ban3.setBank_Name("KARANATAKA BANK");
   
      
    ArrayList <Banks>list =new ArrayList<Banks>();
     list.add(ban);
     list.add(ban1);
     
     ArrayList<Banks> list1=new ArrayList<Banks>();
     list1.add(ban2);
     list1.add(ban3);
     
     cus.setBank(list);
     cus1.setBank(list1);
     
     t.begin();
     em.persist(cus);
     em.persist(cus1);
     em.persist(ban);
     em.persist(ban1);
     em.persist(ban2);
     em.persist(ban3);
     t.commit();

	}

}
