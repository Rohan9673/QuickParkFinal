package com.quickpark.in.model;

public class Login {

	private String UserName;
	private String Password;
	private String Role;


	public Login() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println(UserName+"  "+Password);
		
	}

	public Login(String userName, String password, String role) {
		super();
		UserName = userName;
		Password = password;
		Role=role;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
