package com.xworkz.application.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.application.entity.FoodDelivaryEntity;

public class FoodDeliveryRepositoryImpl implements FoodDeliveryRepository {
	
	
	private SessionFactory sessionFactory;

	public FoodDeliveryRepositoryImpl( SessionFactory sessionFactory) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.sessionFactory=sessionFactory;
	}

	@Override
	public void save(FoodDelivaryEntity entity) {
		System.out.println("Invoked save");
		System.out.println("Implmentation using JPA");
		Session session = sessionFactory.openSession();
		session.save(entity);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		


	}

}
