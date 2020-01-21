package com.myCompany.hibernateConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class App {

	private static PersonService service;
	static {
		service=new PersonServiceImpl();
	}
	public static void main(String[] args) throws IOException

	{	int choice=-2;
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		List<Person> list = new ArrayList<Person>();
		  
		try
		{
			do 
		
		  {
			  System.out.println("1. Create Person.");
			  System.out.println("2. Display All person.");
			  System.out.println("3. Get customer By Id.");
			  System.out.println("4. Update person.");
			  System.out.println("5. Delete Person");
			  choice = Integer.parseInt(br.readLine().toString());
			  switch(choice)
			  {
			  
			  case 1:
				  String arr[] = UUID.randomUUID().toString().split("-");
				  System.out.println("Enter Name: ");
				  String n= br.readLine();
				  System.out.println("Enter Date Of Birth(yyyy-mm-dd): ");
				  String str=br.readLine();
				  LocalDate date=LocalDate.parse(str);
				  Person person = new Person((arr[0]+arr[1]),n,date);
				  System.out.println(person);
				  break;
				  
			  case 2:
  				  list = service.getAllPersons();
  				  Iterator i = list.iterator();
  				 while(i.hasNext())
  				  {
  					 System.out.println(i.next());
  				  }
  				 break; 
  				 
			  case 3:
				  System.out.println("Enter Id: ");
				  
			  	 }
			  
				  
		  }while(choice!=0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				 
	}
}