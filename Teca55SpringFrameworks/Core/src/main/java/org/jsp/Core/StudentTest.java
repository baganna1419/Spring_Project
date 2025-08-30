package org.jsp.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StudentConfig.xml");
//		System.out.println("Single Ton Scope");
//		Student student1=applicationContext.getBean("student",Student.class);
//		System.out.println(student1);
//		Student student2=applicationContext.getBean("student",Student.class);
//		System.out.println(student2);
//		Student student3=applicationContext.getBean("student",Student.class);
//		System.out.println(student3);
		System.out.println("Prototype Scope");
		Student student1=applicationContext.getBean("student",Student.class);
		System.out.println(student1);
		Student student2=applicationContext.getBean("student",Student.class);
		System.out.println(student2);
		Student student3=applicationContext.getBean("student",Student.class);
		System.out.println(student3);
		
	}

}
