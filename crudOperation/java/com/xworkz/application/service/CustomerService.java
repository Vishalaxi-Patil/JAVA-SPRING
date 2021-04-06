package com.xworkz.application.service;

import com.xworkz.application.entity.CustomerEntity;

public interface CustomerService {
	
	boolean validateAndPersist(CustomerEntity entity);

}
