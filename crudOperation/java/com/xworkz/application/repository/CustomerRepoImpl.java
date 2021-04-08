package com.xworkz.application.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.application.entity.CustomerEntity;

public class CustomerRepoImpl implements CustomerRepo {

	public CustomerRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void persist(CustomerEntity entity) {
		System.out.println("Invoked persist");
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
