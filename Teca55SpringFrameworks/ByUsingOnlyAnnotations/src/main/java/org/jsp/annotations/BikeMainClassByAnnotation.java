package org.jsp.annotations;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeMainClassByAnnotation {
	public static void main(String[] args) {
		System.out.println("By replacing XML File");
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BikeConfig.class);
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		Bike bike = applicationContext.getBean("bike",Bike.class);	
		System.out.println(bike);
	}

}
