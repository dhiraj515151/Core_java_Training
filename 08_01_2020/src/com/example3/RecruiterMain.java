package com.example3;
public class RecruiterMain {
public static void main(String[] args) throws DetailAmbiguityException
{
 Employee e = new Employee(101, "dhiraj", "Address1", 5);
 Employee e1 = new Employee(102, "james", "Address2",0);
 boolean result = e.equals(e1);
if(result)
{		 	 System.err.println("Duplicacy in data");	
			 throw new DetailAmbiguityException("Ambigous Details");
		 }
else {
   try {
	e.createEmployee();
	System.out.println(e);
	e1.createEmployee();
	System.out.println(e1);
} catch (HireExperienceException he) {
	
	he.printStackTrace();
	System.err.println("Experience not sufficient");
}}
}
}