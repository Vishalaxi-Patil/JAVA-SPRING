package com.xworkz.itc.property;

public class ItcProduct {
	
	
	private String name;
	private String type;
	private String experiryDate;
	
	
	public ItcProduct(String name) {
		System.out.println("Created "+this.getClass().getSimpleName());
			this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Invoked displayDetails");
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		System.err.println("experryDate:"+experiryDate);
		
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public void setExperiryDate(String experiryDate) {
		this.experiryDate = experiryDate;
	}
	
	
	

}
