package com.jsp.jpa.dao;

import java.sql.Date;
import java.util.List;

import com.jsp.jpa.entity.User;

public interface IUserDao {

	void addUser(User user);

	List<User> fetchAllUsersDetails();

	User getUserByMobile(String mobile);

	User updatePasswordByMobileNum(String mobileNumber, String password);

	boolean removeUserByMobileNumber(String mobileNumber);

	User fetchUserByFname(String firstName);

	List<User> fetchUsersBewteenDOB(Date date1,Date date2);


	

}
