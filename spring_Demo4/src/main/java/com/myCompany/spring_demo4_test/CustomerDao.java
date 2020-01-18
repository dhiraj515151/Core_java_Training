package com.myCompany.spring_demo4_test;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDao {
		List<Customer> list = null;
			Customer cust;
public Customer createCustomer(String firstname, String lastname, String email, String id)
{
	cust.setFirstname(firstname);
	cust.setLastname(lastname);
	cust.setEmail(email);
	cust.setId(id);
	list.add(cust);
	return cust;	
}
public List<Customer> displayCustomer()
{
	return list;	
}

}