package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User createUser(User user) {
	return userDao.save(user);
	}

	@Override
	@Transactional
	public List<User> getAllUser() {
		
		return userDao.findAll();
	}

	@Override
	@Transactional
	public Optional<User> getUserById(Integer id) {
		
		return userDao.findById(id);
	}

}
