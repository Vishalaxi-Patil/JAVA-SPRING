package com.xworkz.application;

import com.xworkz.application.constant.FoodType;
import com.xworkz.application.entity.FoodDelivaryEntity;
import com.xworkz.application.repository.FoodDeliveryRepository;
import com.xworkz.application.repository.FoodDeliveryRepositoryImpl;
import com.xworkz.application.service.FoodDeliveryService;
import com.xworkz.application.service.FoodDeliveryServiceImpl;

public class FoodDeliveryTester {
	
	public static void main(String[] args) {
		
		FoodDelivaryEntity entity=new FoodDelivaryEntity("Masala rice",50,FoodType.SOUTH_INDIAN, 1);
		FoodDeliveryRepository repository=new FoodDeliveryRepositoryImpl();
		FoodDeliveryService service=new FoodDeliveryServiceImpl(repository);
		service.validateAndSave(entity);
	}

}
