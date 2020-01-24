package com.quickpark.in.model;

import javax.validation.constraints.NotNull;

public class Login {
    @NotNull
	private String userName;
    @NotNull
	private String password;
	private String role;


	public Login() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println(userName+"  "+password);
		
	}

	public Login(String username, String pass, String r) {
		super();
		userName = username;
		password = pass;
		role=r;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String r) {
		role = r;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String username) {
		userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		password = pass;
	}
}
