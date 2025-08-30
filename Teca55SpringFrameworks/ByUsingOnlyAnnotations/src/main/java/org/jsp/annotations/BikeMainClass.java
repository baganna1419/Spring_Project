package org.jsp.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("BikeConfig.xml");
		Bike bike = applicationContext.getBean("bike",Bike.class);
		System.out.println(bike);
		
	}

}
