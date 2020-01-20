package com.myCompany.javaconfig;
import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public int updateCustomerById(String uId,String firstName)throws SQLException;
	public int deleteCustomer(String uId) throws SQLException;
}