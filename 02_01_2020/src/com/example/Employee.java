package com.example;

import java.time.LocalDate;
import java.util.UUID;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;

	// default constructor
	public Employee() {

	}

	// Parameterized constructor
	public Employee(int employeeId, String employeeName, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public static Employee createEmployee(int employeeId, String employeeName, double salary) {
		return new Employee(employeeId,employeeName,salary);
	}

	public String displayEmployeeDetails() {
		return "Employee ID: " + employeeId + "Employee Name: " + employeeName + "Salary: " + salary;
	}
	

}
