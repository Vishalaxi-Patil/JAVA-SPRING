package com.xworkz.injection.washingMachine.component;

public class WashingMachine {

	private String companyName;
	private float capacity;
	private Motor motor;
	private Power power;

	public void wash() {
		if (power.isOn()) {
			this.motor.rotate();
			System.out.println("companyName:" + companyName);
			System.out.println("capacity:" + capacity);

		}
	}

	public WashingMachine(String companyName, float capacity, Motor motor) {
		super();
		System.out.println("Invoked WashingMachine");
		this.companyName = companyName;
		this.capacity = capacity;
		this.motor = motor;

	}

	public void setPower(Power power) {
		this.power = power;
	}

}
