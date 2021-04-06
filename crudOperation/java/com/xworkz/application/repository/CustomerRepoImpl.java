package com.xworkz.application.repository;

import com.xworkz.application.entity.CustomerEntity;

public class CustomerRepoImpl implements CustomerRepo{
	
	public CustomerRepoImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@Override
	public void persist(CustomerEntity entity) {
		System.out.println("Invoked persist");
		
	}

}
