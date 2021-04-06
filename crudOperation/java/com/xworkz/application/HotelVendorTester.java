package com.xworkz.application;

import com.xworkz.application.constant.HotelType;
import com.xworkz.application.entity.HotelVendorEntity;
import com.xworkz.application.repository.HotelVendorRepo;
import com.xworkz.application.repository.HotelVendorRepoImpl;
import com.xworkz.application.service.HotelVendorSer;
import com.xworkz.application.service.HotelVendorSerImpl;

public class HotelVendorTester {

	public static void main(String[] args) {
	
		
		HotelVendorEntity entity=new HotelVendorEntity("Taj","Hubli",10, HotelType.FAMILY);
		
		HotelVendorRepo repo=new HotelVendorRepoImpl();
		HotelVendorSer ser=new HotelVendorSerImpl(repo);
		ser.ValidateAndSave(entity);
		

	}

}
