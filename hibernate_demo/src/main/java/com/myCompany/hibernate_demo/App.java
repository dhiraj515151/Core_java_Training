package com.myCompany.hibernate_demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myComapny.hibernate_demo.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
        			.buildSessionFactory();
        	Session session=factory.openSession();
        	Date d = new Date();
        	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        	d = sdf.parse("24-02-1997");
        	Person person=new Person(UUID.randomUUID().toString(), "dhir",d );
        	session.getTransaction().begin();
        	session.save(person);
        	session.getTransaction().commit();
        	System.out.println("done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
      
    }
}