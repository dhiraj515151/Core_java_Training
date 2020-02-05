package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;

@SpringBootApplication
public class SpringJpaIntegrationApplication implements CommandLineRunner {

//	private BookDAO bookDAO;
//	
//	@Autowired
//	public SpringJpaIntegrationApplication(BookDAO bookDAO) {
//		super();
//		this.bookDAO = bookDAO;
//	}
	

	public static void main(String[] args)
	{
		SpringApplication.run(SpringJpaIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		bookDAO.save(new Book("Book-1","Author-1"));
//		bookDAO.save(new Book("Book-2","Author-2"));
//		bookDAO.save(new Book("Book-3","Author-3"));
//		
	
	}

	
	
}




	


