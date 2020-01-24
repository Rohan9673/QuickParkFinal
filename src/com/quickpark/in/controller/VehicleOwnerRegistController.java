package com.quickpark.in.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quickpark.in.model.PropOwner;
import com.quickpark.in.model.VehicleOwner;
import com.quickpark.in.service.VehicleOwnerService;

@Controller
public class VehicleOwnerRegistController {

	@Autowired
	VehicleOwnerService vehicleownerservice;

	public void setVehicleownerservice(VehicleOwnerService vehicleownerservice) {
		this.vehicleownerservice = vehicleownerservice;
	}
	
	@RequestMapping(value="/xyz",method = RequestMethod.GET)
	public String save()
	{	
			return "home";
	}
	
	@RequestMapping(value="/xyz",method = RequestMethod.POST)
	public String save(@Valid@ModelAttribute("owner") VehicleOwner owner,BindingResult result)
	{	
		if (result.hasErrors()) {
			 
			return "Prop_Owner_register";
		 
		} 
		if(vehicleownerservice.add(owner))
			return "login";
		else 
			return "home";
	}

	
}
