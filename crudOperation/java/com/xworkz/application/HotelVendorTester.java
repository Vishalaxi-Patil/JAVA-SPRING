package com.xworkz.application;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.xworkz.application.constant.HotelType;
import com.xworkz.application.entity.HotelVendorEntity;

import com.xworkz.application.service.HotelVendorSer;


public class HotelVendorTester {

	public static void main(String[] args) {

		//HotelVendorEntity entity = new HotelVendorEntity("Taj", "Hubli", 10, HotelType.FAMILY);
        HotelVendorEntity entity1=new HotelVendorEntity("Durga","Lakshmeshwar",10,HotelType.RESORT);
		ApplicationContext conatainer=new ClassPathXmlApplicationContext("application.xml","application-db.xml");
		HotelVendorSer ref=conatainer.getBean(HotelVendorSer.class);
		//ref.ValidateAndSave(entity);
		ref.ValidateAndSave(entity1);
	    SessionFactory f=conatainer.getBean(SessionFactory.class);
	    System.out.println(f);
         
	}

}
