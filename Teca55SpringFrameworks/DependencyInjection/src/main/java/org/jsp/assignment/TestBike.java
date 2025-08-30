package org.jsp.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/BikeConfig.xml");
		Bike bike = applicationContext.getBean("bik",Bike.class);
		System.out.println(bike);
		
	}

}
