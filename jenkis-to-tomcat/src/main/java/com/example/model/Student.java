package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name = "first_name")
	private String first_Name;
	@Column(name = "last_name")
	private String last_Name;

	
	public Student() {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
	}
	

}
