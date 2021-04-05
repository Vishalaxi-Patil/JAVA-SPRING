package com.xworkz.spring.component;

public class ClubComponent {
	
	private String trustName;
	private int noOfTrust;
	
	
	public ClubComponent(String trustName) {
		System.out.println("Invoked ClubComponent:"+trustName);
		this.trustName=trustName;
		
	}
	public ClubComponent(String trustName,int noOfTrust) {
		System.out.println("Invoked ClubComponent:trustName: "+trustName+" noOfTrust:"+noOfTrust) ;
		this.trustName=trustName;
		this.noOfTrust=noOfTrust;
		
	}
	
	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}
	
	
	public String getTrustName() {
		return trustName;
	}
	
	

}
