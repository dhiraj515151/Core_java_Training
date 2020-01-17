package com.mycompany.spring_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_demo3.TennisCoach;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=
        			new ClassPathXmlApplicationContext("applicationContext.xml");
        	TennisCoach theCoach=context.getBean("theCoach",TennisCoach.class);
        	System.out.println(theCoach.getDailyFortune());
        	
			
		} 
        
        catch (Exception e)
        {
			e.printStackTrace();
			
		}
    }
}