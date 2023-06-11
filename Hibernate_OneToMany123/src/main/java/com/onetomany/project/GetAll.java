package com.onetomany.project;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dev");
        EntityManager em = emf.createEntityManager();
      EntityTransaction t = em.getTransaction();
      
    Query qu = em.createQuery("select c from Customer c where c.customer_Phno=?3");
    qu.setParameter(3, 9636464894l);
    
   List<Customer> cus = qu.getResultList();
   
   for(Customer cuss:cus)
   {
	  System.out.println("the customer name is:"+cuss.getCustomer_Name());
	  
	 List<Banks> ban = cuss.getBank();
	 
	 for(Banks bann:ban)
	 {
		 System.out.println("the BANKS name is:"+bann.getBank_Name());
	 }
   }

	}

}
