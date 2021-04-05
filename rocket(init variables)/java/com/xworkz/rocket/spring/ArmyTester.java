package com.xworkz.rocket.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.rocket.component.ArmyComponent;

public class ArmyTester {
	public static void main(String[] args) {
		
		
		String xmlFileName="army.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		ArmyComponent refOfArmy=container.getBean(ArmyComponent.class);
		System.out.println(refOfArmy.getStrength());
		System.out.println(refOfArmy.getType());
	}

}
