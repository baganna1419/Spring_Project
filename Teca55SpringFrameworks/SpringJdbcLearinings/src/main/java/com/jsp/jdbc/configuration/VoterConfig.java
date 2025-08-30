package com.jsp.jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jsp.jdbc")
public class VoterConfig {

	@Bean("DataSource")
	public DataSource getDateSource() {
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/teca55springjdbc");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("12345");
		return driverManagerDataSource;
	}
	@Bean("JdbcTemplate")
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
		
	}

}
