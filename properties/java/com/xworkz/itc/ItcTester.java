package com.xworkz.itc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.itc.property.ItcProduct;

public class ItcTester {
	
	public static void main(String[] args) {
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("itc.xml");
		
		ItcProduct refOfItc=container.getBean(ItcProduct.class);
		refOfItc.displayDetails();
		
		
	
	}

}
