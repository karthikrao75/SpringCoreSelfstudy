package com.karthik.SpringDemo.SpringExample10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DetailsConfig {

	@Bean
	public User user(){
		return new User(address());
	}
	
	@Bean
	public Address address(){
		return new Address();
	}
}
