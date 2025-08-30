package com.jsp.student.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.entity.Student;

@Service
public class StudentServiceImplementation implements StudentService {
	static Scanner sc = new Scanner(System.in);
	@Autowired
	StudentDao studentDao;

	public void registration() {
		Student student = new Student();
		System.out.print("Enter Student Name : ");
		student.setStudentname(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter Student Stream : ");
		student.setStudentstream(sc.next());
		System.out.print("Enter Student Mobile Number : ");
		student.setStudentmobilenumber(sc.next());
		System.out.print("Enter Student Email-Id : ");
		student.setStudentemail(sc.next());
		System.out.print("Enter Student Password : ");
		student.setStudentpassword(sc.next());
		System.out.print("Enter Student Address  : ");
		student.setStudentaddress(sc.next());
		int result = studentDao.insertStudentData(student);
		if (result != 0) {
			System.out.println("Student Registered Succesfully...!!!!");
		} else {
			System.out.println("Something Went Wrong..");
		}

	}

	public void changeStreamById() {
		System.out.println("Enter Student Id : ");
		int studentId = sc.nextInt();
		if (studentDao.checkStudentId(studentId)) {
			System.out.println("Enter Stream To Update : ");
			String stream = sc.next();
			int result = studentDao.updateStreamByStudentId(stream, studentId);
			if (result != 0) {
				System.out.println("Stream Updated Succesfully..");
			}
		} else {
			System.out.println("INvalid Id..");
		}

	}

	public void showStudentDetails() {
		List<Student> studentDetails = studentDao.displayStudentDetails();
		if (!studentDetails.isEmpty()) {
			System.out.println(studentDetails);
		} else {
			System.out.println("No Students Found...");
		}

	}

	public void deleteStudentDetailsBasedOnId() {
		System.out.println("Enter Student Id : ");
		int studentId = sc.nextInt();
		if (studentDao.checkStudentId(studentId)) {
			if (studentDao.deleteStudentDetailsByStudentId(studentId) != 0) {
				System.out.println("deleted Student details Succesfully..");

			}

		} else {
			System.out.println("INvalid Id..");

		}

	}

}
