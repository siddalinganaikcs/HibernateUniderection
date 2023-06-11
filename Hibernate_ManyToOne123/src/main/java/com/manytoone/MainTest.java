package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Dev");
        EntityManager em = emf.createEntityManager();
      EntityTransaction t = em.getTransaction();
      
      
      State state=new State();
      state.setState_Capital("bengaluru");
      state.setState_CM("bommai");
      state.setState_Laungauge("kannada");
      state.setState_Name("tarnataka");

      State state1=new State();
      state1.setState_Capital("chanai");
      state1.setState_CM("stalen");
      state1.setState_Laungauge("tamil");
      state1.setState_Name("tamilunadu");
      
      State state2=new State();
      state2.setState_Capital("hydarabad");
      state2.setState_CM("null");
      state2.setState_Laungauge("telagu");
      state2.setState_Name("Andrapradesh");
      
      State state3=new State();
      state3.setState_Capital("kocchi");
      state3.setState_CM("null");
      state3.setState_Laungauge("malayalam");
      state3.setState_Name("kerala");
      
      
      Country country=new Country();
      country.setCountry_Capital("new Dheli");
      country.setCountry_Name("India");
      country.setCountry_PM("Narendra modi");
      
      state.setCountry(country);
      state1.setCountry(country);
      state2.setCountry(country);
      state3.setCountry(country);
      
      t.begin();
      em.persist(state);
      em.persist(state1);
      em.persist(state2);
      em.persist(state3);
      em.persist(country);
      t.commit();
      
      
	}

}
