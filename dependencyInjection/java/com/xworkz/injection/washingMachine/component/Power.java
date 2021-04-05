package com.xworkz.injection.washingMachine.component;

public class Power {

	private boolean on;

	public boolean isOn() {
		System.out.println("Invoked isOn");
		if (on) {
			return true;
		} else {
			return false;
		}

	}

	public Power(boolean on) {
		super();
		System.out.println("Invoked power");
		System.out.println("Power:"+on);
		this.on = on;
	}
	
	
}
