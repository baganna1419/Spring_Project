package com.jsp.jpa.service;

public interface IUserService {

	void registration();

	void displayAllUsers();

	void changePasswordByMobileNum();
	boolean checkMobileIsPresentOrNot(String mobileNumber);

	void removeUserByMobile();

	void displayUserByFirstName();

	void displayUsersBewteenDateOfBirth();



}
