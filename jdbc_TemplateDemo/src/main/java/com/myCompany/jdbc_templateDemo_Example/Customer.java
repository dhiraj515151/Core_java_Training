package com.myCompany.jdbc_templateDemo_Example;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	private String uid;
	private String firstName;
	private String lastName;
	private String email;
	

	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", firstName=" + firstName + ", "
				+ "lastName=" + lastName + ", email=" + email
				+ "]";
	}

}
