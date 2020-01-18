package com.myCompany.spring_jdbc_Demo1;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


import com.myCompany.spring_jdbc_Demo_example.Customer;
import com.myCompany.spring_jdbc_Demo_example.CustomerDao;

@Component
public class App 
{
    public static void main( String[] args )
    {
        try
        {
        	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        	CustomerDao dao = context.getBean("dao", CustomerDao.class) ;
        	Customer c = dao.createCustomer(new Customer(UUID.randomUUID().toString(),"John","Dao","dsjh@gmail.com"));
        	System.out.print(c);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
