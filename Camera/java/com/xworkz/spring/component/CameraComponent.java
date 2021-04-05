package com.xworkz.spring.component;

public class CameraComponent {
	
	public CameraComponent() {
		
		System.out.println("Invoked "+this.getClass().getSimpleName());
	}
	
	public void capture(String what) {
		System.out.println("Invoked capture");
		System.out.println("arg1:"+what);
		
	}

}
