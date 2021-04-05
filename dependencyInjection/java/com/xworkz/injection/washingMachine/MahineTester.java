package com.xworkz.injection.washingMachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.injection.washingMachine.component.WashingMachine;

public class MahineTester {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("washing.xml");
		WashingMachine refOfMachine=container.getBean(WashingMachine.class);
		refOfMachine.wash();
		
	}

}
