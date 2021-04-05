package com.xworkz.injection.washingMachine.component;

public class Motor {
	
	private int warrantyPeriod;
	
	
	public Motor() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	
	public void rotate() {
		System.out.println("motor rotating");
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		
		System.out.println("Invoked setWarrantyPeriod");
		System.out.println("warrantyPeriod:"+warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}

}
