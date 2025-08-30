package org.jsp.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainClass {
	public static void main(String[] args) {
		//Create IOC Container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StudentConfig.xml");
		System.out.println("Student Object has been Created Successfully..!!!!");
		//Accessing the Object from IOC Container by using Class Path
		Student student1=applicationContext.getBean("student",Student.class);
		System.out.println(student1);
		Student student2=applicationContext.getBean("student",Student.class);
		System.out.println(student2);
		
		
	}

}
