package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class InsertDriver {

	public static void main(String[] args) {
		FoodOrder fo = new FoodOrder();
		fo.setToname("adam");
		fo.setStatus("delivered");

		Item i = new Item();
		i.setName("coco");
		i.setQuantity(2);
		i.setCost(200);

		Item i1 = new Item();
		i1.setName("cake");
		i1.setQuantity(1);
		i1.setCost(200);

		i.setFoodorder(fo);
		i1.setFoodorder(fo);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(fo);
		entityManager.persist(i);
		entityManager.persist(i1);
		entityTransaction.commit();

	}
}
