package com.myCompany.spring_jdbc_Demo_example;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Customer {
	private String uid;
	private String firstName;
	private String lastName;
	private String email;
	
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", firstName=" + firstName + ","
				+ " lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	

}
