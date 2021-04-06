package com.xworkz.application.service;

import com.xworkz.application.entity.CustomerEntity;
import com.xworkz.application.repository.CustomerRepo;

 public class CustomerServiceImpl implements CustomerService {
	private CustomerRepo customerRepo;
	
	

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.customerRepo = customerRepo;
	}

	@Override
	public boolean validateAndPersist(CustomerEntity entity) {
		System.out.println("Invoked validateAndPersist");
		if (entity != null) {
			System.out.println("entity is not null");
			this.customerRepo.persist(entity);
		}
		return false;
	}

}
