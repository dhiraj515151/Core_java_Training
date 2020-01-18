package com.myCompany.spring_jdbc_Demo_example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")

public class CustomerDaoImp implements CustomerDao {
	private Connection con;
	private DataSource dataSource;
	private PreparedStatement pstmt;
	private static Logger log = Logger.getLogger("com.myCompany.spring_jdbc_Demo_example.CustomerDaoImp");
	
	@Autowired
	public CustomerDaoImp(DataSource dataSource)
	{
		super();
		this.dataSource= dataSource;
	}
	@PostConstruct
	public void init()
	{
		try 
		{
			log.info("Establishing Connection. ");
			con = dataSource.getConnection();
			log.info("Connection Established. ");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	

	@Override
	public Customer createCustomer(Customer customer) throws SQLException
	{
		pstmt= con.prepareStatement("insert into customer(uid,firstName,lastName, email) values (?,?,?,?)");
		pstmt.setString(1, customer.getUid());
		pstmt.setString(2, customer.getFirstName());
		pstmt.setString(3, customer.getLastName());
		pstmt.setString(4, customer.getEmail());
		pstmt.executeUpdate();
		return customer;
		
		
	}

}
