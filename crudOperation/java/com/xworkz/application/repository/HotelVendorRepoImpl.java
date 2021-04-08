package com.xworkz.application.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.application.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepo{

	public HotelVendorRepoImpl() {
	      System.out.println("created "+this.getClass().getSimpleName());	
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("Invoked save");
		Configuration configuration = new Configuration();
		configuration.configure();
		// configuration.addAnnotatedClass(BBCEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(entity);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
	}

}
