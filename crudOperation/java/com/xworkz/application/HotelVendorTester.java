package com.xworkz.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.application.constant.HotelType;
import com.xworkz.application.entity.HotelVendorEntity;

import com.xworkz.application.service.HotelVendorSer;


public class HotelVendorTester {

	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("Taj", "Hubli", 10, HotelType.FAMILY);

		ApplicationContext conatainer=new ClassPathXmlApplicationContext("application.xml");
		HotelVendorSer ref=conatainer.getBean(HotelVendorSer.class);
		ref.ValidateAndSave(entity);
		

	}

}
