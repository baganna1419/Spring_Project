package org.jsp.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Excecution Started..");

		// From developer
//		Employee employee = new Employee();
//		employee.info();

		// From IOC Container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("CoreConfig.xml");
		System.out.println("Object Created.....!!!");
		Employee employee1=(Employee)applicationContext.getBean("employee1");
		employee1.info();
		System.out.println("------------------------------------------------");
		Employee employee2=(Employee)applicationContext.getBean("employee2");
		employee2.info();
	}
}
