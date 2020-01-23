package com.quickpark.in.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.quickpark.in.model.PropOwner;

@Repository
public class PropOwnerDaoImple implements PropOwnerDao{

	@Autowired
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public boolean add(PropOwner owner) {
		
			String sql= "insert into VehicleOwner values(?,?,?,?,?,?)";
		
		int i=jt.update(sql, new Object[] {
				owner.getOwnreId(),
				owner.getFirstName(),
				owner.getLastName(),
				owner.getMobNo(),
				owner.getEmailID(),	
				owner.getPassword()
						
				
		});
		
		return true;
	}

	
}
