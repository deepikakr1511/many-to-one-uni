package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class InsertDriver3 {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setName("samsung");
		m.setCost(23456);
		
		Sim s=new Sim();
		s.setName("air 15");
		s.setProvider("Airtel");
		s.setMobile(m);
		
		Sim s1=new Sim();
		s1.setName("bsnl");
		s1.setProvider("BSNL");
		s1.setMobile(m);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(m);
		em.persist(s);
		em.persist(s1);
		et.commit();
		
		
		
		
	}

}
