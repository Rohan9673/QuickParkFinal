package com.quickpark.in.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;

public class PropOwner {
	 @Size(min = 5,max = 15,message="required")
	private String UserName;
	 @NotNull(message="required")
	private String Address;
	 @NotNull(message="required")
	private String FirstName;
	 @NotNull(message="required")
	private String LastName;
	
	 @NotNull
	
	private long MobNo;
	 @Email
	private String  EmailId;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	private String Password;
	
	
	
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	
	public String getAddrsss() {
		return Address;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(String mobNo) {
		MobNo =Long.parseLong(mobNo);
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public PropOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropOwner(String firstName, String lastName, long mobNo, String emailID, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		MobNo = mobNo;
		EmailId = emailID;
		Password = password;
	}
	
	
	
	
}
