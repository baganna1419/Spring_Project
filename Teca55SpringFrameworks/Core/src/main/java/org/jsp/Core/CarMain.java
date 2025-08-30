package org.jsp.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
	public static void main(String[] args) {
		//Ioc Container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("CarConfig.xml");
		Car car1=applicationContext.getBean("car1",Car.class);
		System.out.println(car1);
		Car car2=applicationContext.getBean("car2",Car.class);
		System.out.println(car2);
		Car car3=applicationContext.getBean("car3",Car.class);
		System.out.println(car3);
		
		
	}

}
