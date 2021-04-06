package com.xworkz.application;

import com.xworkz.application.entity.CustomerEntity;
import com.xworkz.application.repository.CustomerRepo;
import com.xworkz.application.repository.CustomerRepoImpl;
import com.xworkz.application.service.CustomerService;
import com.xworkz.application.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerEntity entity = new CustomerEntity("Omkar", "Banglore", 10, 678987675);
		CustomerRepo repo = new CustomerRepoImpl();
		CustomerService service = new CustomerServiceImpl(repo);
		service.validateAndPersist(entity);
	}
}
