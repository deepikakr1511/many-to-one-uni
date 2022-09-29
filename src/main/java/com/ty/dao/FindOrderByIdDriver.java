package com.ty.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class FindOrderByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class, 3);
		System.out.println(item.getId());
		System.out.println(item.getName());
		System.out.println(item.getQuantity());
		System.out.println(item.getCost());
		FoodOrder i=item.getFoodorder();
		if(i!=null)
		{
			System.out.println(i.getId());
			System.out.println(i.getToname());
			System.out.println(i.getStatus());
		
		}

	}

}
