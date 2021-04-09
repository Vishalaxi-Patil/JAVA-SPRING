package com.xworkz.application;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.xworkz.application.entity.CustomerEntity;

public class HibernateCriteriaDemo {
	
	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Criteria criteria=session.createCriteria(CustomerEntity.class);
		//criteria.add(Restrictions.gt("id",2));
		//criteria.add(Restrictions.eq("rating", 10));
		criteria.add(Restrictions.ilike("name","vishalaxi"));
		List<CustomerEntity> list=criteria.list();
		for(CustomerEntity ct:list) {
			System.out.println(ct);
			
		}
		
		
			
		
	}

}
