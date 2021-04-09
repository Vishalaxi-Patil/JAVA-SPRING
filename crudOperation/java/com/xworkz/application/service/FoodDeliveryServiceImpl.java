package com.xworkz.application.service;

import com.xworkz.application.entity.FoodDelivaryEntity;
import com.xworkz.application.repository.FoodDeliveryRepository;
import com.xworkz.application.service.FoodDeliveryService;

public class FoodDeliveryServiceImpl implements FoodDeliveryService{
	
	private FoodDeliveryRepository foodDeliveryRepository;
	
	public FoodDeliveryServiceImpl(FoodDeliveryRepository foodDeliveryRepository) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.foodDeliveryRepository=foodDeliveryRepository;
	}

	@Override
	public boolean validateAndSave(FoodDelivaryEntity entity) {
		System.out.println("Invoked validateAndSave");
		if(entity!=null) {
			System.out.println("entity is not null so valid all fields");
			this.foodDeliveryRepository.save(entity);
			
		}else {
			System.out.println("entity is null");
		}
		return false;
	}

}
