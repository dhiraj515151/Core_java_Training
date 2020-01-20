package com.myCompany.jdbc_templateDemo_Dao;

import java.sql.SQLException;
import java.util.List;

import com.myCompany.jdbc_templateDemo_Example.Customer;

public interface CustomerDao2 
		{
		public Customer createCustomer(Customer customer)  throws Exception;
		public List<Customer> getAllCustomer() throws SQLException;
		List<Customer> getCustomerById(String uId) throws SQLException;

		}
