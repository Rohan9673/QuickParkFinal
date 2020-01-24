package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.VehicleOwnerDao;
import com.quickpark.in.model.VehicleOwner;

@Service
public class VehicleOwnerServiceImple implements VehicleOwnerService {
	
	@Autowired
	VehicleOwnerDao vehicleownerdao;
	
	public void setVehicleownerdao(VehicleOwnerDao vehicleownerdao) {
		this.vehicleownerdao = vehicleownerdao;
	}
	
	@Override
	public boolean add(VehicleOwner owner) {
		
		
		return vehicleownerdao.add(owner);
	}

	
	

}
