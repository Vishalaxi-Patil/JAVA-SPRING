package com.xworkz.injection.constructorInjection;

public class Browser {

	private Internet internet;

	public Browser(Internet internet) {
		System.out.println("Invoked " + this.getClass().getSimpleName());
		this.internet=internet;

	}

}
