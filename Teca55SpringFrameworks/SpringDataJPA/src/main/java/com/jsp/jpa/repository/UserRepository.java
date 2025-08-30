package com.jsp.jpa.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	public User findByfirstName(String fname);
	public List<User> findBydobBetween(Date dob1,Date dob2);


}
