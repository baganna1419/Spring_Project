package org.jsp.setterInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("org/jsp/xmlConfigurationFiles/MobileConfig.xml");
		Mobile mobile = applicationContext.getBean("mob",Mobile.class);
		System.out.println(mobile);
		
	}

}
