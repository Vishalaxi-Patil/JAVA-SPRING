package com.xworkz.rocket.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.rocket.component.SofwareComponent;

public class SoftwareTester {

	public static void main(String[] args) {
		
		
		String xmlFileName="software.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		SofwareComponent refOfContainer=container.getBean(SofwareComponent.class);
		System.out.println(refOfContainer.getType());
		System.out.println(refOfContainer.getVersion());

	}

}
