package com.xworkz.application;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.application.entity.CustomerEntity;

import com.xworkz.application.service.CustomerService;

public class CustomerTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("hibernate.cfg.xml", "application-db.xml",
				"application.xml");
		SessionFactory sf = container.getBean(SessionFactory.class);
		System.out.println(sf);
		CustomerService service = container.getBean(CustomerService.class);
		/*
		 * CustomerEntity entity = new CustomerEntity("Omkar", "Banglore", 10,
		 * 678987675); CustomerEntity entity1 = new CustomerEntity("Vishalaxi", "Gadag",
		 * 10, 789878987); CustomerEntity entity2 = new CustomerEntity("Sushma",
		 * "Gadag", 7, 909898789); CustomerEntity entity3 = new
		 * CustomerEntity("Aishwarya", "Laksmeshwar", 7, 989878675); CustomerEntity
		 * entity4 = new CustomerEntity("Vena", "Gojjanur", 9, 789651245);
		 * CustomerEntity entity5 = new CustomerEntity("Akshara", "Banglore",
		 * 10,876545678); service.validateAndPersist(entity);
		 * service.validateAndPersist(entity1); service.validateAndPersist(entity2);
		 * service.validateAndPersist(entity3); service.validateAndPersist(entity4);
		 * service.validateAndPersist(entity5);
		 */
		CustomerEntity entity6 = new CustomerEntity("Lavanya", "banglore", 8, 876765678);
		service.validateAndPersist(entity6);

	}
}
