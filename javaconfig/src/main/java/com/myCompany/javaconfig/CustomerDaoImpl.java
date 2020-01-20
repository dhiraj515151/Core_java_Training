package com.myCompany.javaconfig;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



@Component("dao")

public class CustomerDaoImpl implements CustomerDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into customer(uid,firstName,lastName,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		String query="select uid,firstName,lastName,email from customer";
		
		
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException
	{
		String query="select uid,firstName,lastName,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
	}

	@Override
	public int updateCustomerById(String uId ,String firstName) throws SQLException {
		String query = "update customer set firstName=?  where uid = ? ";
		return jdbcTemplate.update(query, firstName,uId); 	
	}
	
	@Override
	public int deleteCustomer(String uId) throws SQLException {
		String query = "delete from Customer where uid= ?";
		return jdbcTemplate.update(query,new Object[] {uId});
		
	}
	

	

}