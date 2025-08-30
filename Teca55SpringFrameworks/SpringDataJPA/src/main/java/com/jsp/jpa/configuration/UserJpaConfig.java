package com.jsp.jpa.configuration;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.jsp.jpa")
@EnableJpaRepositories(basePackages = "com.jsp.jpa")
public class UserJpaConfig {
	@Bean("entityManagerFactory")
	public LocalEntityManagerFactoryBean getFactory() {
		LocalEntityManagerFactoryBean factory=new LocalEntityManagerFactoryBean();
		factory.setPersistenceUnitName("SpringDataJPA");
		return factory;
	}
	@Bean("transactionManager")
	public JpaTransactionManager getManager(EntityManagerFactory factory) {
		JpaTransactionManager manager=new JpaTransactionManager();
		manager.setEntityManagerFactory(factory);
		return manager;
	}
	

}
