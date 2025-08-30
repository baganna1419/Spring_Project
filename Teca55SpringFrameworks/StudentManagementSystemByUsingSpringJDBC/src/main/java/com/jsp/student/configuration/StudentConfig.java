package com.jsp.student.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jsp.student")
public class StudentConfig {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource =new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/teca55springjdbc?");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		return dataSource;
	}
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource);
		return template;
	}
	

}
