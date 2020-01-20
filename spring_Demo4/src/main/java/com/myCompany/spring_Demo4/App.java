package com.myCompany.spring_Demo4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myCompany.spring_demo4_test.Customer;
import com.myCompany.spring_demo4_test.Service;

public class App 
{	
    public static void main( String[] args ) throws IOException
    {	
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        Service sr = context.getBean("service",Service.class);
        do
        {
        	
        	System.out.println("Enter your choice: ");
        	System.out.println("1.  Create Customer : ");
        	System.out.println("2. Show all Customers : ");
        	choice = Integer.parseInt(br.readLine());
        	
        	switch(choice)
        	{
        	case 1: System.out.println("Enter customer first name");
        	 		String first = br.readLine();
        	 		System.out.println("Enter customer last name");
        	 		String last = br.readLine();
        	 		System.out.println("Enter customer email");
        	 		String email = br.readLine();
        	 		String id = UUID.randomUUID().toString();
        	 		sr.createCustomer(first, last, email, id);
        	 		break;
        	case 2: System.out.println("Displaying...");
        	        List<Customer> l = sr.displayCustomer();
        	        Iterator<Customer> i = l.iterator();
        	        while(i.hasNext())
        	        {
        	        	System.out.println(i.next());
        	        }
        	        break;
        
        	case 0: 
        			
        			System.exit(0);
        			break;
        	default:
        			break;		
        	}
        }
        while(choice!=0);
    }
}