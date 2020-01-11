import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number of employee: ");
		
		int n=Integer.parseInt(br.readLine());
		
		List<Employee> empList=new ArrayList<Employee>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details for employee "+(i+1));
			//read all the attributes like name,department,doj ,age and salary by using bufferReader
			String name=br.readLine();//read name
			
			String department=br.readLine();
			//read department
			
			Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			//read doj
			int age=Integer.parseInt(br.readLine());
			//read age
			int salary=Integer.parseInt(br.readLine());
			//read salary
			Employee em=new Employee(name,department,dateOfJoining,age,salary);
			
			empList.add(em);
			//all attributes add in list of employee
		}
		
			System.out.println("1. sort by salary");
			System.out.println("2.Sort by age and doj");
			System.out.println("Enter your choice:");
			
			int choice=Integer.parseInt(br.readLine());//for reading user choice
			
			switch(choice)
			{
			case 1:
				
				Collections.sort(empList);
				EmployeeBO.printEmployees(empList);
				break;
				
			case 2:
				
				Collections.sort(empList,new AgeComparator());
				EmployeeBO.printEmployees(empList);
				break;
				
				
			}
		}

	}
