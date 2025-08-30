package org.jsp.annotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.annotations")
public class BikeConfig {
	//we can create both userdefined class and predefined class objects by using method 
	//But recommended way only to go with methods only for Predefined classes beacuse
//	we can modify by keeping @Component annotation
	@Bean("bike")
	public Bike getBike(Date date) {
		Bike bike=new Bike("R15","Blue",140000,date);
		return bike;
	}
	@Bean("date")
	public Date getDate() {
		return new Date();
	}
	

}
