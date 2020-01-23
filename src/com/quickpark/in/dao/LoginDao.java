package com.quickpark.in.dao;

import com.quickpark.in.model.Login;

public interface LoginDao {
	Login validateUser(Login login);
}
