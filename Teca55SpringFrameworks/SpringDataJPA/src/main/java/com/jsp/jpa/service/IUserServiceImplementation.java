package com.jsp.jpa.service;

import java.sql.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.jpa.dao.IUserDao;
import com.jsp.jpa.entity.User;

@Service("userService")
public class IUserServiceImplementation implements IUserService {

	Scanner sc = new Scanner(System.in);
	@Autowired
	private IUserDao userDao;

	public void registration() {
		User user = new User();
		System.out.print("Enter First Name :");
		user.setFirstName(sc.next());
		System.out.print("Enter Last Name :");
		user.setLastName(sc.next());
		System.out.print("Enter Email Id :");
		user.setEmailId(sc.next());
		System.out.print("Enter Mobile Number :");
		user.setMobileNumber(sc.next());
		System.out.print("Enter Date Of Birth (yyyy-mm-dd) :");
		Date date = Date.valueOf(sc.next());
		user.setDob(date);
		System.out.println("Enter User Name :");
		user.setUserName(sc.next());
		System.out.print("Enter Password :");
		user.setPassword(sc.next());
		userDao.addUser(user);
	}

	public void displayAllUsers() {
		List<User> allUsers = userDao.fetchAllUsersDetails();
		if (!allUsers.isEmpty()) {
			System.out.println("***********************************************");
			System.out.println("   ALL USER DETAILS   ");
			System.out.println("***********************************************");
			ListIterator<User> listIterator = allUsers.listIterator();
			while (listIterator.hasNext()) {
				User user = (User) listIterator.next();
				System.out.println("First Name : " + user.getFirstName());
				System.out.println("Last Name  : " + user.getLastName());
				System.out.println("Email Id   : " + user.getEmailId());
				System.out.println("Mobile Numb: " + user.getMobileNumber());
				System.out.println("DOB        : " + user.getDob());
				System.out.println("UserName   : " + user.getUserName());
				System.out.println("Password   : " + user.getPassword());
				System.out.println("******************************************************************");

			}
		} else {
			System.out.println("***********************************************");
			System.out.println("             NO User Found...!!!               ");
			System.out.println("***********************************************");

		}

	}

	public void changePasswordByMobileNum() {
		System.out.print("Enter Mobile Number : ");
		String mobileNumber = sc.next();
		if (checkMobileIsPresentOrNot(mobileNumber)) {
			System.out.print("Enter New Password : ");
			String password = sc.next();
			User user = userDao.updatePasswordByMobileNum(mobileNumber, password);
			if (user != null) {
				System.out.println("**********************************************");
				System.out.println("               USER PASSWORD UPDATED          ");
				System.out.println("**********************************************");

			}
		} else {
			System.out.println("***********************************************");
			System.out.println("             NO User Found...!!!               ");
			System.out.println("***********************************************");

		}

	}

	public boolean checkMobileIsPresentOrNot(String mobileNumber) {
		List<User> allUsersDetails = userDao.fetchAllUsersDetails();
		if (!allUsersDetails.isEmpty()) {
			for (User user : allUsersDetails) {
				if (user.getMobileNumber().equalsIgnoreCase(mobileNumber)) {
					return true;
				}

			}
		}
		return false;
	}

	public void removeUserByMobile() {
		System.out.print("Enter Mobile Number : ");
		String mobileNumber = sc.next();
		if (userDao.removeUserByMobileNumber(mobileNumber)) {
			System.out.println("**********************************************");
			System.out.println("               USER Removed           ");
			System.out.println("**********************************************");
		} else {
			System.out.println("***********************************************");
			System.out.println("             NO User Found...!!!               ");
			System.out.println("***********************************************");

		}
	}

	public void displayUserByFirstName() {
		System.out.print("Enter First Name : ");
		String firstName = sc.next();
		User user = userDao.fetchUserByFname(firstName);
		if (user != null) {
			System.out.println("*************************************************");
			System.out.println("First Name : " + user.getFirstName());
			System.out.println("Last Name  : " + user.getLastName());
			System.out.println("Email Id   : " + user.getEmailId());
			System.out.println("Mobile Numb: " + user.getMobileNumber());
			System.out.println("DOB        : " + user.getDob());
			System.out.println("UserName   : " + user.getUserName());
			System.out.println("Password   : " + user.getPassword());
			System.out.println("*************************************************");

		} else {
			System.out.println("***********************************************");
			System.out.println("  NO User Found with Given First Name...!!!    ");
			System.out.println("***********************************************");
		}
	}

	public void displayUsersBewteenDateOfBirth() {
		System.out.print("Enter Starting  Date Of Birth (yyyy-mm-dd) :");
		Date date1 = Date.valueOf(sc.next());
		System.out.print("Enter Ending  Date Of Birth (yyyy-mm-dd) :");
		Date date2 = Date.valueOf(sc.next());
		List<User> fetchUsersBewteenDOB = userDao.fetchUsersBewteenDOB(date1, date2);
		if (!fetchUsersBewteenDOB.isEmpty()) {
			ListIterator<User> listIterator = fetchUsersBewteenDOB.listIterator();
			while (listIterator.hasNext()) {
				System.out.println("******************************************************************");
				User user = (User) listIterator.next();
				System.out.println("First Name : " + user.getFirstName());
				System.out.println("Last Name  : " + user.getLastName());
				System.out.println("Email Id   : " + user.getEmailId());
				System.out.println("Mobile Numb: " + user.getMobileNumber());
				System.out.println("DOB        : " + user.getDob());
				System.out.println("UserName   : " + user.getUserName());
				System.out.println("Password   : " + user.getPassword());
				System.out.println("******************************************************************");

			}
		} else {
			System.out.println("***********************************************");
			System.out.println("             NO User Found...!!!               ");
			System.out.println("***********************************************");

		}

	}

	

}
