package com.myCompany.jdbc_templateDemo_Dao;
import java.sql.SQLException;
import java.util.List;

import com.myCompany.jdbc_templateDemo_Example.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException, Exception;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById();
}