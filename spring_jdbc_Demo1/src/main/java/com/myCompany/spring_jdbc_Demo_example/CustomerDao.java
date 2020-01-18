package com.myCompany.spring_jdbc_Demo_example;

import java.sql.SQLException;

public interface CustomerDao {
	
	public Customer createCustomer(Customer customer) throws SQLException;
	

}
