package com.myCompany.spring_demo2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myCompany.spring_demo_bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        try {
			
        	ApplicationContext context=
        			new ClassPathXmlApplicationContext("spring.xml");
        	Employee employee=context.getBean("employee",Employee.class);
        	Employee employee1=context.getBean("employee",Employee.class);
        	System.out.println(employee==employee1);
        	System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}