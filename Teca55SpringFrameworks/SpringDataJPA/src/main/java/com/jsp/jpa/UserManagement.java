package com.jsp.jpa;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jpa.configuration.UserJpaConfig;
import com.jsp.jpa.service.IUserService;

/**
 * Hello world!
 *
 */
public class UserManagement {
	public static void main(String[] args) {
		// IOC Container
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(UserJpaConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		IUserService service = context.getBean("userService", IUserService.class);
		while (true) {
			System.out.println("*******************************************");
			System.out.println("*******************************************");
			System.out.println("        WELCOME TO USER MANAGEMENT         ");
			System.out.println("*******************************************");
			System.out.println("*******************************************");
			System.out.println("Enter 1 :- For Registrtaion");
			System.out.println("Enter 2 :- For Fetch ALl Users");
			System.out.println("Enter 3 :- Change Password By MObile NUmber ");
			System.out.println("Enter 4 :- Remove User By Mobile Number ");
			System.out.println("Enter 5 :- Display User By First Name");
			System.out.println("Enter 6 :- Display User By DOB");

			System.out.print("Chooose The Choice From The Above Listed :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				service.registration();
				break;
			case 2:
				service.displayAllUsers();
				break;
			case 3:
				service.changePasswordByMobileNum();
				break;
			case 4:
				service.removeUserByMobile();
				break;
			case 5:
				service.displayUserByFirstName();
				break;
			case 6:
				service.displayUsersBewteenDateOfBirth();
				break;
//			case 7:service.deleteTheUserByEmailAndPassword();break;

			default:
				System.out.println("Invalid choice");
			}

			System.out.println(".....Enter Yes to Continue (or) No to Exit.....   :-");
			String option = sc.next();
			if (option.equalsIgnoreCase("yes"))
				continue;
			else if (option.equalsIgnoreCase("no")) {
				System.out.println("Thank You....!!!!");
				break;
			} else
				System.out.println("Sorry wait for a while👋👋👋👋👋👋👋👋");
		}

	}
}
