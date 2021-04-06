package com.xworkz.application.service;

import com.xworkz.application.entity.HotelVendorEntity;
import com.xworkz.application.repository.HotelVendorRepo;

public class HotelVendorSerImpl implements HotelVendorSer{
	
	private HotelVendorRepo hotelVendorRepo;

	public HotelVendorSerImpl(HotelVendorRepo hotelVendorRepo) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.hotelVendorRepo=hotelVendorRepo;
	}

	@Override
	public boolean save(HotelVendorEntity entity) {
		System.out.println("Invoked save");
		if(entity!=null) {
			System.out.println("entity is not null");
			this.hotelVendorRepo.save(entity);
		}
		return false;
	}

}
