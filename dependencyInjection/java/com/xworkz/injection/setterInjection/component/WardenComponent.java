package com.xworkz.injection.setterInjection.component;

public class WardenComponent {
	
	private String name;
	
	public WardenComponent() {
		System.out.println("Invoked "+this.getClass().getSimpleName());
	}
	
	
    public void wardenDetals() {
    	System.out.println("Invoked wardenDetals");
    	System.out.println("Name:"+name);
    	
    }
	
	public void setName(String name) {
		this.name = name;
	}
	
	

}
