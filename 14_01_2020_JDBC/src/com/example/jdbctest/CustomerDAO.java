package com.example.jdbctest;

import java.sql.SQLException;

public interface CustomerDAO {
	
	public Customer createCuastomer(String firstName,String lastName,String email) throws SQLException;

}