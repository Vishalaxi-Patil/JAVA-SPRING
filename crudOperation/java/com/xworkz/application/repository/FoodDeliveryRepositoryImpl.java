package com.xworkz.application.repository;

import com.xworkz.application.entity.FoodDelivaryEntity;

public class FoodDeliveryRepositoryImpl implements FoodDeliveryRepository {

	public FoodDeliveryRepositoryImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodDelivaryEntity entity) {
		System.out.println("Invoked save");
		System.out.println("Implmentation using JPA");

	}

}
