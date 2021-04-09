package com.xworkz.application;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.application.constant.FoodType;
import com.xworkz.application.entity.FoodDelivaryEntity;

import com.xworkz.application.service.FoodDeliveryService;

public class FoodDeliveryTester {

	public static void main(String[] args) {

		FoodDelivaryEntity entity = new FoodDelivaryEntity("Masala rice", 50, FoodType.SOUTH_INDIAN, 1);
		ApplicationContext container = new ClassPathXmlApplicationContext("application-db.xml", "hibernate.cfg.xml",
				"application.xml");
		FoodDeliveryService service = container.getBean(FoodDeliveryService.class);
		service.validateAndSave(entity);
		SessionFactory sf = container.getBean(SessionFactory.class);
		System.out.println(sf);
		FoodDelivaryEntity entity2 = new FoodDelivaryEntity("Rotti utta", 100, FoodType.NORTH_INDIAN, 1);
		service.validateAndSave(entity2);

	}

}
