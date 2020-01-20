package com.myCompany.jdbc_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myCompany.jdbc_configExample.Customer;
import com.myCompany.jdbc_configExample.CustomerConfig;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=
    		   new AnnotationConfigApplicationContext(CustomerConfig.class);
       Customer c=context.getBean("customer", Customer.class);
       c.setUid("100");
       c.setFirstName("John");
       c.setLastName("Doe");
       c.setEmail("john@email.com");
       System.out.println(c);
    	
    }
}