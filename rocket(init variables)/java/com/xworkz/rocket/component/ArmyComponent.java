package com.xworkz.rocket.component;

public class ArmyComponent {

	private String countryName;
	private String strength;
	private String type;

	public ArmyComponent(String countryName) {
		System.out.println("intializing countryName:" + countryName + " using ArmyComponent contr");
		this.countryName = countryName;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStrength() {
		return strength;
	}

	public String getType() {
		return type;
	}

}
