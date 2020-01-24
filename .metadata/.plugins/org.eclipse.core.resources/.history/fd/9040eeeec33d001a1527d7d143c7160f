package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.LoginDao;
import com.quickpark.in.model.Login;
@Service
public class LoginServiceImple implements LoginService {

	@Autowired
	private LoginDao Dao;
	@Override
	public Login validateUser(Login login) {
		
			return Dao.validateUser(login) ;
}
}
