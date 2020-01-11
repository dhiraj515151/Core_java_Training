package com.example;

import java.time.LocalDate;
import java.util.UUID;

public class Emp {
	private String empId;
	private String empName;
	private   LocalDate date;
	
	public Emp(String empId, String empName, LocalDate date)
	{
		super();
		this.empId=UUID.randomUUID().toString();
		this.empName = empName;
		this.date = date;
	}
	
}
