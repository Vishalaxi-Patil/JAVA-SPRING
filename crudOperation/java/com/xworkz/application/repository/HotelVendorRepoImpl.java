package com.xworkz.application.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.application.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepo{
	
	
	private SessionFactory sessionFactory;

	public HotelVendorRepoImpl(SessionFactory sessionFactory) {
	      System.out.println("created "+this.getClass().getSimpleName());	
	      this.sessionFactory=sessionFactory;
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("Invoked save");
		Session session = sessionFactory.openSession();
		session.save(entity);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		
		
		
	}

}
