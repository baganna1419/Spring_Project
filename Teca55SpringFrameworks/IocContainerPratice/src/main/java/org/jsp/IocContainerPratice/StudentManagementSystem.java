package org.jsp.IocContainerPratice;

import java.util.Scanner;

import org.jsp.IocContainerPratice.entity.service.StudentService;
import org.jsp.IocContainerPratice.entity.service.StudentServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class StudentManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("StudentConfig.xml");
	StudentService  studentService =applicationContext.getBean("studentServiceImplementation",StudentServiceImplementation.class);
		while (true) {
			System.out.print("Enter -1 For Registration : ");
			System.out.print("Enter -2 For Display : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:studentService.registration();break;
			case 2:studentService.display();break;
			default:
				break;
			}

		}
	}
}
