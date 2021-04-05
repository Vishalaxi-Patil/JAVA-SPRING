package com.xworkz.injection.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTester {
	
	public static void main(String[] args) {
		
	ApplicationContext container=new ClassPathXmlApplicationContext("injection.xml");
	Internet refOfBrowser=container.getBean(Internet.class);
	refOfBrowser.connect();
	
	
	
	
	
	
		
	}

}
