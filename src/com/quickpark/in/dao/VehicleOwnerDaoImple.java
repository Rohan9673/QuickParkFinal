package com.quickpark.in.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quickpark.in.model.VehicleOwner;

@Repository
public class VehicleOwnerDaoImple implements VehicleOwnerDao{

	@Autowired
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	

	
	@Override
	@Transactional
	public boolean add(VehicleOwner owner) {
		
		String sql= "insert into vehicleowner(UserName,FirstName,LastName,MobileNO,EmailId,Address,Status,Password) values(?,?,?,?,?,?,?,?)";
		
		
	
		int i=jt.update(sql, new Object[] {
			
			owner.getUserName(),	
			owner.getFirstName(),
			owner.getLastName(),
			owner.getMobNo(),
			owner.getEmailID(),
			owner.getAddress(),
			1,
			owner.getPassword()
					
			
	});
	

		
		return true;
	}

}
