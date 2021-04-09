package com.xworkz.application.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.application.entity.CustomerEntity;

public class CustomerRepoImpl implements CustomerRepo {
	
	private SessionFactory sessionFactory;;

	public CustomerRepoImpl(SessionFactory sessionFactory) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.sessionFactory=sessionFactory;
	}

	@Override
	public void persist(CustomerEntity entity) {
		System.out.println("Invoked persist");
		Session session = sessionFactory.openSession();
		session.save(entity);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		

	}

}
