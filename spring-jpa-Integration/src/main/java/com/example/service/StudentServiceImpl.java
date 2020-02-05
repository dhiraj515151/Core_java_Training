package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.StudentDao;
import com.example.entity.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao dao;

	@Autowired
	public StudentServiceImpl(StudentDao dao) {
	 super();
	 this.dao=dao;	
	}

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		
		return dao.findAll();
	}

	

	

}
