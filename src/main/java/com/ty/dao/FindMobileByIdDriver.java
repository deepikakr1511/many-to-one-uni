package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Sim;

public class FindMobileByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Sim s=em.find(Sim.class, 1);
		if(s!=null)
		{
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getProvider());
			System.out.println(s.getMobile());
		}
		Sim s1=em.find(Sim.class, 2);
		if(s1!=null)
		{
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getProvider());
			System.out.println(s1.getMobile());
		}

	}

}
