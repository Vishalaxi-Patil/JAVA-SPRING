package com.xworkz.injection.setterInjection.component;

public class PGComponent {

	private String owerName;

	private WardenComponent wardenComponent;

	public PGComponent(WardenComponent wardenComponent) {
		this.wardenComponent = wardenComponent;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

}
