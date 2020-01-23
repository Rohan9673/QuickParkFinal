package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.PropOwnerDao;
import com.quickpark.in.model.PropOwner;


@Service
public class PropOwnerServiceImple implements PropOwnerService{

	@Autowired
	private PropOwnerDao propownerdao;
	
	
	public void setPropownerdao(PropOwnerDao propownerdao) {
		this.propownerdao = propownerdao;
	}

	

	@Override
	public boolean add(PropOwner owner) {
		// TODO Auto-generated method stub
		return propownerdao.add(owner);
	}

}
