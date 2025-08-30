package org.jsp.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/BankConfig.xml");
		Bank bank = applicationContext.getBean("bk",Bank.class);
		System.out.println(bank);	
	}

}
