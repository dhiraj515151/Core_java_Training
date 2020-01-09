package com.example_ToDo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tester  {
public static void main(String[] args) throws IOException
{
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	Service s = new ServiceImplementation();
	String todoid = null;
	
	while(true) {
		System.out.println("1. create todo");
		System.out.println("2. display all todo");
		System.out.println("3. find todo");
		System.out.println("4. remove todo");
		System.out.println("5. remove todo");
		System.out.println("5. Update ToDo");
		System.out.println("0. exit");
		System.out.print("Enter your choice: ");
	int choice = Integer.parseInt(sc.readLine());
	switch(choice)
	{
	 case 1: System.out.println("Enter you todo name: ");
	         String task = sc.readLine();
	         s.createToDo(task);
	         break;

	 case 2: System.out.println(s.getAllToDo());
	         break;
	         
	 case 3: System.out.println("Enter task id :");
	 		 todoid = sc.readLine();
	 		 System.out.println(s.findById(todoid));
             break;        
	
	 	 	
	 case 4:System.out.println("Enter task id");
	        String str = sc.readLine();
	        System.out.println("Enter task Name");
	        String str2 = sc.readLine();
	        s.updateById(str, str2);
	        break;	
	 case 5:System.out.println("Enter task id");
	        String str1 = sc.readLine();
	        s.removeById(str1);
	        System.out.println("Removed you ToDO.");
	        break;
	 case 6:System.out.println("All Cleared your ToDo.");
	 		s.removeAll();
	 		break;
	 case 7 :System.out.println("Exit"); 
	 		System.exit(0);
		        
	 
	 default: break;	 	
	}}
}
}