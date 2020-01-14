package com.jdbcExample;
import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = -375065079056659899L;
	
	private int customerid;
	private String firstName;
	private String lastName;
	private String email;
	public Customer(int customerid, String firstName, String lastName, String email) {
		super();
		this.customerid = customerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	

}
