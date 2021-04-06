package com.xworkz.application.repository;

import com.xworkz.application.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepo{

	public HotelVendorRepoImpl() {
	      System.out.println("created "+this.getClass().getSimpleName());	
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("Invoked save(");
		
	}

}
