package com.xworkz.spring.component.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;

public class CameraTester {
	public static void main(String[] args) {
		
		String xmlFileName="camera.xml";//getting meta data info
		
	    //creating object for camera class using spring framework 
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		
		
		//to get ref from spring object
		CameraComponent refOfCameraComponent=spring.getBean(CameraComponent.class);
		refOfCameraComponent.capture("Selfie");
		
		String s1="abc";
		String s2="abd";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		
		
		
		
	}
	
	

}
