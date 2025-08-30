package org.jsp.dependencyInjection;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Message {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/MessageConfig.xml");
		MessageCreater message= applicationContext.getBean("msg",MessageCreater.class);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Username: ");
		String name=sc.next();
		message.displayMessage(name);	
	}
}
