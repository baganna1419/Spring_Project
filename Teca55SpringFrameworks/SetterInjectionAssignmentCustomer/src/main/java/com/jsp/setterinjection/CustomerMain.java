package com.jsp.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/CustomerConfig.xml");
		Customer customer = applicationContext.getBean("cust", Customer.class);
		System.out.println(customer);
	}

}
