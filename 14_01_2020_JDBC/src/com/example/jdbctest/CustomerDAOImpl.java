package com.example.jdbctest;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class CustomerDAOImpl implements CustomerDAO {

	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	private Customer customer=null;
	{
		factory=MyConnectionFactory.getFactoryObject();
		try {
			connection=factory.getMyConnection();
		} catch (IOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public Customer createCuastomer(String firstName, String lastName, String email) throws SQLException {
		customer=new Customer();
		pStatement=connection.prepareStatement("insert into "
				+ "customer(firstname,lastname,email) "        
				+ "values(?,?,?)");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	
	public List<Customer> getAllCustomer() throws SQLException
	{
		String query = "select * from Customer";
		List<Customer> list = new ArrayList<Customer>();
		Customer customer = null;
		ResultSet rs = null;
		try
		{
			Statement st=connection.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
			customer = new Customer();
			customer.getCustomerId();
			customer.getFirstName();
			customer.getLastName();
			customer.getEmail();
			list.add(customer);
			}
			
		}
		finally
		{
			connection.close();
		}
		
		return list;
	}

}