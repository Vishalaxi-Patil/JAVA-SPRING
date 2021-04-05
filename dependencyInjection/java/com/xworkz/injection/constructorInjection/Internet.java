package com.xworkz.injection.constructorInjection;

public class Internet {

	private float speed;

	public Internet() {
		System.out.println("Invoked " + this.getClass().getSimpleName());
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public void connect() {
		System.out.println("Invoked connect");
		System.out.println("Speed:"+speed);
	}

}
