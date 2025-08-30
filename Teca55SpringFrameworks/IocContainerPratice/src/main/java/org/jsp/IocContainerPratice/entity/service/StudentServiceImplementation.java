package org.jsp.IocContainerPratice.entity.service;


import java.util.List;
import java.util.Scanner;

import org.jsp.IocContainerPratice.dao.StudentDao;
import org.jsp.IocContainerPratice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentServiceImplementation implements StudentService {
	static Scanner sc = new Scanner(System.in);
	@Autowired
	StudentDao studentDao;
	public void display() {
		List<Student> details = studentDao.getDetails();
		System.out.println(details);

	}

	public void registration() {
		Student student = new Student();
		System.out.print("Enter Student Id : ");
		student.setStudentId(sc.nextInt());
		System.out.print("Enter Student Name : ");
		student.setStudentName(sc.next());
		System.out.print("Enter Mobile Number : ");
		student.setStudentMobileNumber(sc.next());
		System.out.print("Enter Address : ");
		student.setAddress(sc.next());
		studentDao.storeStudent(student);
		
		
	}

}
