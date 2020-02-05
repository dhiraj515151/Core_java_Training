package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	private StudentService service;
	
	@Autowired
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	@GetMapping("/students")
	public List<Student> getAll()
	{
		return service.getAllStudent();  
	}

	
	

}
