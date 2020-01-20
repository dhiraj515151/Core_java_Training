package com.myCompany.jdbc_templateDemo_Dao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.myCompany.jdbc_templateDemo_Example.Customer;
import com.myCompany.jdbc_templateDemo_Example.CustomerRowMapper;
@Component("dao2")

public class CustomerDaoImpl2ndVersion implements CustomerDao2 {
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws Exception {
		String query = "insert into Customer(uid,firstName,lastName,email)values (?,?,?,?)";
		jdbcTemplate.update(query, new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),
				customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() throws SQLException {
		String query = "select uid , firstName ,lastName, email from Customer";
		return jdbcTemplate.query(query, new CustomerRowMapper());
		
	}
	@Override
	public List<Customer> getCustomerById(String uid) throws SQLException {
		String query="select uid,firstName,lastName,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uid},new CustomerRowMapper());
	}
}
