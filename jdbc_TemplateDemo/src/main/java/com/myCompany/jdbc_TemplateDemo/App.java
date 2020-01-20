package com.myCompany.jdbc_TemplateDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myCompany.jdbc_templateDemo_Dao.CustomerService;
import com.myCompany.jdbc_templateDemo_Dao.CustomerServiceImpl;
import com.myCompany.jdbc_templateDemo_Example.Customer;

public class App 
{
	CustomerService service;
	
    public static void main( String[] args ) throws SQLException, Exception
    {
    	
    	ClassPathXmlApplicationContext context=null;
    	BufferedReader br=null;
    	CustomerService service = null;	
    	List<Customer> list = new ArrayList<Customer>();
    	
        
    	try
    	{
    		
    		br=new BufferedReader(new InputStreamReader(System.in));
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",CustomerServiceImpl.class);
    	}
    	
    	catch(Exception e)
    	{
    		e.getStackTrace();
    	}
    	
        finally 
        {
			context.close();
		}
    	int choice = -1;
    	String uid ,
    	firstName = null,
    	lastName = null,
    	email = null;
    	do
    	{
    		System.out.println("1. create customer.");
    		System.out.println("2. display all customer.");
    		System.out.println("3. find customer by uid.");
    		System.out.print("enter your choice>> ");
    	    choice =Integer.parseInt(br.readLine()) ;
    		switch(choice)
    		{
    		case 1: 
    				System.out.println("Enter first Name:  ");
    				String fname= br.readLine();
    				System.out.println("Enter last Name : ");
    				String lname = br.readLine();
    				System.out.println("Enter email Id : ");
    				String emailId = br.readLine();
    				String[] arr=UUID.randomUUID().toString().split("-");
    				uid=arr[0]+arr[1];
    				service.createCustomer(new Customer( uid, fname, lname, emailId));
    				break;
    		case 2:
    			
    				list = service.getAllCustomers();
    				Iterator i = list.iterator();
    				while(i.hasNext())
    				{
        			 System.out.println(i.next());
    				}
    				
    				break;
    				
    		case 3:

				System.out.print("uid>> ");
				uid=br.readLine();
				list=service.getCustomerById();
				System.out.println(list);
				if(list.isEmpty())
				{
					System.out.println("customer not found");
				}
				else
				{
					System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
					list.forEach(c->{
						System.out.println(c);
					});
				}
				break;
				
    		}
    			
    	}while(choice !=0);
    }
}
