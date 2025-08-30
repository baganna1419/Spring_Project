package org.jsp.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
	public static void main(String[] args) {
		//Ioc Container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/CarConfig.xml");
		System.out.println("Xml File Loaded..");
		Car car1 = applicationContext.getBean("c1",Car.class);
		System.out.println(car1);
		Car car2 = applicationContext.getBean("c2",Car.class);
		System.out.println(car2);
		Car car3 = applicationContext.getBean("c3",Car.class);
		System.out.println(car3);
		
		
	}

}
