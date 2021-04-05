package com.xworkz.spring.component.spring;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.ClubComponent;

public class ClubTester {

	public static void main(String[] args) {

		String xmlFileName = "camera.xml";

		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFileName);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		String refOfString = container.getBean(String.class);
		System.out.println("String:" + refOfString);
		ClubComponent refOfClub = container.getBean("clubComponent1", ClubComponent.class);
		System.out.println(refOfClub.getTrustName());
	}

}
