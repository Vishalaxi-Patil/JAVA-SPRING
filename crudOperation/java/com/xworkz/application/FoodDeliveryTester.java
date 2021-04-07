package com.xworkz.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.application.constant.FoodType;
import com.xworkz.application.entity.FoodDelivaryEntity;

import com.xworkz.application.service.FoodDeliveryService;

public class FoodDeliveryTester {

	public static void main(String[] args) {

		FoodDelivaryEntity entity = new FoodDelivaryEntity("Masala rice", 50, FoodType.SOUTH_INDIAN, 1);
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		FoodDeliveryService service = container.getBean(FoodDeliveryService.class);
		service.validateAndSave(entity);

	}

}
