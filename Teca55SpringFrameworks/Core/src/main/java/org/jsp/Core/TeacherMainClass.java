package org.jsp.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMainClass {
	public static void main(String[] args) {
		//Creating IOC Container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("TeacherConfig.xml");
		//Access Object From IOC Container
		Teacher teacher1=applicationContext.getBean(Teacher.class);
		System.out.println(teacher1);
//		teacher1.teacherInfo();
		System.out.println("-----------------------------------------------");
		Teacher teacher2=applicationContext.getBean(Teacher.class);
		System.out.println(teacher2);
//		teacher2.teacherInfo();
	}

}
