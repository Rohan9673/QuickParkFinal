package com.quickpark.in.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quickpark.in.model.PropOwner;
import com.quickpark.in.service.PropOwnerService;


@Controller
public class PropRegistrationController {

	@Autowired
	PropOwnerService propownerservice;

	public void setPropownerservice(PropOwnerService propownerservice) {
		this.propownerservice = propownerservice;
	}
	
	@RequestMapping(value="/pqr",method = RequestMethod.GET)
	public String save()
	{	
			return "home";
	}
	
	@RequestMapping(value="/pqr",method = RequestMethod.POST)
	public String save(@Valid@ModelAttribute("owner") PropOwner owner,BindingResult result)
	{	
		if (result.hasErrors()) {
			 
			return "Prop_Owner_register";
		 
		} 
		 
		  
		if(propownerservice.add(owner))
			return "login";
		else 
			return "home";
	}
		
}
