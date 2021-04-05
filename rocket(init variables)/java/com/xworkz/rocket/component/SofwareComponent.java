package com.xworkz.rocket.component;

public class SofwareComponent {
	
	private String name;
	private String vendor;
	private float version;
	private String type;
	
	
	public SofwareComponent(String name, String vendor) {
		System.out.println("Intializing "+name+" and "+vendor+" using SoftwareCompo");
		this.name = name;
		this.vendor = vendor;
	}
	
	public void setVersion(float version) {
		this.version = version;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public float getVersion() {
		return version;
	}
	
	public String getType() {
		return type;
	}
	


}
