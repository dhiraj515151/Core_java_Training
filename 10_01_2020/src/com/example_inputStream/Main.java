package com.example_inputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
{	Scanner sc = new Scanner(System.in);
	Employee e;
	ObjectOutputStream oos;
	List<Employee> emp = new ArrayList<Employee>();
	while(true)
	{
	System.out.println("Enter your choice:\n1. Create Employee\n2. Display Employee\n3. Exit");
	int choice = sc.nextInt();
	switch(choice)
		{
		case 1: System.out.println("Enter first name, last name, email");
		 		String first = sc.next();
		 		String last = sc.next();
		 		String email = sc.next();
		 		emp.add(new Employee(first, last, email));
		 		oos = new ObjectOutputStream(new FileOutputStream("Employee"));
		 		oos.writeObject(emp);
		 		oos.flush();
 				oos.close();
		 		break;
		case 2: System.out.println("Displaying...");
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee"));
				List<Employee> list = (List<Employee>) (ois.readObject());
				Iterator i = list.iterator();
				int count = 0;
				while(i.hasNext()) {
				System.out.println(++count+" Employee\n"+i.next());
				}
				ois.close();
				break;
		case 3: System.out.println("Exiting...");
		 		System.exit(0);
		 		break;
		default:System.out.println("Invalid choice");
		 		break;	
		 		
		}
	}
}
}