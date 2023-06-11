package com.onetoone.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dev");
                             EntityManager em = emf.createEntityManager();
                           EntityTransaction t = em.getTransaction();
                           
                           
                           Person person=new Person();
                           
                           person.setPerson_Age(23);
                           person.setPerson_Gender("male");
                           person.setPerson_Name("naik");
                           person.setPerson_Phno(1234567890);
                           
                           
                           PanCard pan=new PanCard();
                           pan.setPan_Address("chowkasandra");
                           pan.setPan_Name("siddalinganaik");
                           pan.setPan_No("ka64547");
                           
                           person.setPan(pan);
                           
                           t.begin();
                           em.persist(pan);
                           em.persist(person);
                           t.commit();
	}

}
