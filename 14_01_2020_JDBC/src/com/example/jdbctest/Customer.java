package com.example.jdbctest;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer implements Serializable {

	private static final long serialVersionUID = -375065079056659899L;
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	public Customer() {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	

}