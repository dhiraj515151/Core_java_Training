package com.myCompany.jdbc_templateDemo_Example;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>
{
	
	@Override
	public Customer mapRow(ResultSet rs, int rowNumber) throws SQLException {
		
		Customer customer=new Customer();
		customer.setUid(rs.getString("uid"));
		customer.setFirstName(rs.getString("firstName"));
		customer.setLastName(rs.getString("lastName"));
		customer.setEmail(rs.getString("email"));
		return customer;
	}

}
