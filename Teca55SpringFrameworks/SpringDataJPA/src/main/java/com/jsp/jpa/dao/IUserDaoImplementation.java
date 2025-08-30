package com.jsp.jpa.dao;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.jpa.entity.User;
import com.jsp.jpa.repository.UserRepository;

@Repository
public class IUserDaoImplementation implements IUserDao {

	@Autowired
	private UserRepository rep;

	public void addUser(User user) {
		User save = rep.save(user);
		if (save != null) {
			System.out.println("--- Registration Successfull---");
		} else {
			System.out.println("%%% 504 Error %%%%");
		}

	}

	public List<User> fetchAllUsersDetails() {
		List<User> allUsers = rep.findAll();
		return allUsers;
	}

	public User getUserByMobile(String mobile) {

		User user = rep.getById(mobile);
		return user;

	}

	public User updatePasswordByMobileNum(String mobileNumber, String password) {
		// One way
		Optional<User> optional = rep.findById(mobileNumber);
		// second way
		User user1 = rep.getById(mobileNumber);
		if (optional.isPresent()) {
			User user = optional.get();
			user.setPassword(password);
			return rep.save(user);
		}
		return null;

	}

	public boolean removeUserByMobileNumber(String mobileNumber) {
		if (rep.findById(mobileNumber).isPresent()) {
			rep.deleteById(mobileNumber);
			return true;
		}
		return false;
	}

	public User fetchUserByFname(String firstName) {
		 return rep.findByfirstName(firstName);
		
	}

	public List<User> fetchUsersBewteenDOB(Date date1,Date date2) {
		return rep.findBydobBetween(date1,date2);
		
	}

	
	
	
	
	

}
