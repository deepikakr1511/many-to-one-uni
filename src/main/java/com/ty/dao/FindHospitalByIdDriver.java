package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Branch;

public class FindHospitalByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Branch b = em.find(Branch.class, 1);
		if (b != null) {
			System.out.println("branch id :" + b.getId());
			System.out.println("branch_loc :" + b.getLocation());
			System.out.println("branch city :" + b.getCity());
			System.out.println("branch phone :" + b.getPhone());
			System.out.println(b.getHospital());
		}
		Branch b1 = em.find(Branch.class, 2);
		if (b1 != null) {
			System.out.println("branch id :" + b1.getId());
			System.out.println("branch_loc :" + b1.getLocation());
			System.out.println("branch city :" + b1.getCity());
			System.out.println("branch phone :" + b1.getPhone());
			System.out.println(b.getHospital());
		}

	}

}
