package com.quickpark.in.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.quickpark.in.model.PropOwner;

@Repository
public class PropOwnerDaoImple implements PropOwnerDao{

	@Autowired
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	

	 

	     
	@Override
	@Transactional
	public boolean add(PropOwner owner) {
		
		
		
		
		String sql= "insert into propertyowner(UserName,FirstName,LastName,MobileNo,EmailId,Address,Status,Password) values(?,?,?,?,?,?,?,?)";
			
			int i=jt.update(sql, new Object[] {
				owner.getUserName(),
				owner.getFirstName(),
				owner.getLastName(),
				owner.getMobNo(),
				owner.getEmailId(),
				owner.getAddress(),
				1,
				owner.getPassword()
				
					
				
		});
		
		return true;
	}

	
}
