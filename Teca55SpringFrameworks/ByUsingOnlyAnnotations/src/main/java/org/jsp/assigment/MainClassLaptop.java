package org.jsp.assigment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassLaptop {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop laptop = applicationContext.getBean("laptop",Laptop.class);
		System.out.println(laptop);
		
	}

}
