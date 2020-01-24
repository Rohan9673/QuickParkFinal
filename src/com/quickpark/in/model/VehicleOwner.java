package com.quickpark.in.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;

public class VehicleOwner {
	 @Size(min = 5,max = 15,message="required")
	private String userName;
	 @NotNull(message="required")
	private String firstName;
	 @NotNull(message="required")
	private String lastName;
	 @NotNull(message="required")
	 @NumberFormat
	 @Size(min = 5,max = 15,message="required")
	private String mobNo;
	 @Email
	private String emailID;
	 @NotNull(message="required")
	private String address;
	 @NotNull
	 @Size(min = 5,max = 15,message="required")
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public VehicleOwner(String userName, String firstName, String lastName, String mobNo, String emailID, String address) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNo = mobNo;
		this.emailID = emailID;
		this.address = address;
	}
	public VehicleOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
