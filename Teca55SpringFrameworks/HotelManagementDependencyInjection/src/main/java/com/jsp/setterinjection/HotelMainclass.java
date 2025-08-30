package com.jsp.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelMainclass {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/HotelManagementConfig.xml");
		HotelManagement hotelManagement = applicationContext.getBean("hotel", HotelManagement.class);
		System.out.println(hotelManagement);
		
	}

}
