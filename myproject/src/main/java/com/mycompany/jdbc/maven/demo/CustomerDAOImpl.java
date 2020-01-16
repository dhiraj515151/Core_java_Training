package com.mycompany.jdbc.maven.demo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
		Customer customer = new Customer(firstName, lastName, email);
		pStatement=connection.prepareStatement("insert into customer(firstName,lastName,email) "
													+ "values(?,?,?)");
		System.out.println(customer.getEmail());
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	
	public List<Customer> getAllCustomer() throws SQLException
	{
		String query = "select customerId, firstName,lastName, email from Customer";
		List<Customer> list = new ArrayList<Customer>();
		Customer customer = null;
		ResultSet rs = null;
		try
		{
			Statement st=connection.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
			customer = new Customer(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getString(3),rs.getString(4));
			
			list.add(customer);
			}	
		}
		finally
		{
			connection.close();
		}
		
		return list;
	}
	
	public Customer findById(int customerId) throws SQLException	
	{
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(" select customerId,firstName, lastName,email "
									+ "from Customer where customerId = customerId;");
		while(rs.next())
		{
			customer = new Customer(Integer.parseInt(rs.getString(1)),
										rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return customer;
		
	}
	
	public Customer deleteByName(String firstName)
	{
		 try {  
			 	pStatement = connection.prepareStatement("delete from customer where firstName = ?");
			 	pStatement.setString(1, firstName);
			 	pStatement.executeUpdate();
		    } 
		 catch(Exception e)
		 {
		        System.out.println(e);
		 }
		
		return customer;
	}
	
	public Customer updateCustomer(Customer customer,int customerId) throws SQLException {
		
		pStatement=connection.prepareStatement("update customer "
										+ "set firstName=? , "
												+ "lastName=?, "
													+ "email=?"
														+ " where customerId=?");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}

}