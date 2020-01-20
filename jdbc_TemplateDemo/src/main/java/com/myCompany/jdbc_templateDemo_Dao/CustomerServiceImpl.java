package com.myCompany.jdbc_templateDemo_Dao;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myCompany.jdbc_templateDemo_Example.Customer;
@Component("service")
public class CustomerServiceImpl implements CustomerService {
private CustomerDao2 dao2;

@Autowired
	public CustomerServiceImpl(CustomerDao2 dao2) {
	super();
	this.dao2 = dao2;
}


	@Override
	public Customer createCustomer(Customer customer) throws Exception {
		
		return dao2.createCustomer(customer);
	}


	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		return dao2.getAllCustomer();
	}


	@Override
	public List<Customer> getCustomerById() {
		
		return null;
	}


	

}