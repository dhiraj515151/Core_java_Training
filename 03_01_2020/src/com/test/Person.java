package com.test;

public class Person {
private String name;
private Address address;
private int age;
//contructorChaining
	public Person()
	{
		this("john" );
		System.out.println("in default constructor.");
	}

	public Person(String name) {
		
		this.name = name;
		this.address = address;
		System.out.println("in 1st constructor.");
	}

	public Person(String name, Address address, int age) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println("in 2nd constructor.");
	}

	
	
	
	

}
