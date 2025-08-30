package com.jsp.student;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.student.configuration.StudentConfig;
import com.jsp.student.service.StudentService;
import com.jsp.student.service.StudentServiceImplementation;

public class StudentManagementSystem 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        //Ioc Container
    	ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
    	StudentService service=context.getBean("studentServiceImplementation",StudentServiceImplementation.class);
    	while(true) {
    		System.out.println("!!!...Welcome To Student Management System...!!!");
    		System.out.println("Enter 1 For Registration ");
    		System.out.println("Enter 2 For Update Stream Based On Student Id ");
    		System.out.println("Enter 3 For Delete Details Of Student By Student Id ");
    		System.out.println("Enter 4 For Display Student Details");
    		System.out.print("Choose The Option Among Them :");
    		int option=sc.nextInt();
    		switch(option) {
    		case 1: service.registration();break;
    		case 2:service.changeStreamById();break;
    		case 3:service.deleteStudentDetailsBasedOnId();break;
    		case 4:service.showStudentDetails();break;
    		}
    	}
    }
}
