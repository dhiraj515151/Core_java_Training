package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.model.User;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User, Integer> {

}
