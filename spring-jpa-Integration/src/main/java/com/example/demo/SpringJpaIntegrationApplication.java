package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.StudentDao;
import com.example.entity.Student;

@SpringBootApplication
public class SpringJpaIntegrationApplication implements CommandLineRunner{
	private StudentDao Dao;
	@Autowired
	public SpringJpaIntegrationApplication(StudentDao dao)
	{
		super();
		this.Dao=dao;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Dao.save(new Student(100,"Dhiraj","Tiwari","IT"));
		Dao.save(new Student(130,"JAMES","Tiwari","CSE"));
		Dao.save(new Student(124,"Shivangi","Sharma","CSE"));
		
		
	}

}
