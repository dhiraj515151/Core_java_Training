package com.example.jdbctest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerApp {
	private static CustomerService service;
	static
	{
		service = new CustomerServiceImpl();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException 
	{
		int choice = 0;
		CustomerDAOImpl c = new CustomerDAOImpl();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Customer> list = new ArrayList<Customer>();
		do {
			System.out.println("1. create customer");
			System.out.println("2. display all customers");
			System.out.println("3. find customer by id");
			System.out.println("4. update customer");
			System.out.println("5. delete customer");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print(" First Name: ");
				String fName=br.readLine().toString();
				System.out.print(" Last Name: ");
				String lName=br.readLine().toString();
				System.out.print(" Email: ");
				String email=br.readLine().toString();
				Customer customer=service.createCuastomer(fName, lName, email);
				System.out.println("Create Customer Success "+customer);
				break;
				
			case 2:
				System.out.println("All Customer: ");
				list = c.getAllCustomer();
				Iterator i = list.iterator();
        		 while(i.hasNext())
        		 {
        			 System.out.println(i.next());
        		 }
				
			case 3: 
				System.out.print("Enter the customer id:  ");
				 int customerId = Integer.parseInt(br.readLine());
				 break;
				 
			case 0:
				System.exit(0);
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}
}