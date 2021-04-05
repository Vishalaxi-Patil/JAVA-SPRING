package com.xworkz.rocket.component;

public class RocketComponent {

	private String fuelType;
	private String country;

	public RocketComponent(String fuelType, String country) {
		System.out.println("Values from RocketComponent constr :fuelType:" + fuelType + " country" + country);
		this.fuelType = fuelType;
		this.country = country;
	}

	public String getFuelType() {
		return fuelType;
	}

	public String getCountry() {
		return country;
	}

}
