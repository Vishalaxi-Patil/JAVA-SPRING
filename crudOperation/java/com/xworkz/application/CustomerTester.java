package com.xworkz.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.application.entity.CustomerEntity;

import com.xworkz.application.service.CustomerService;

public class CustomerTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		CustomerService service = container.getBean(CustomerService.class);
		CustomerEntity entity = new CustomerEntity("Omkar", "Banglore", 10, 678987675);
		service.validateAndPersist(entity);

	}
}
