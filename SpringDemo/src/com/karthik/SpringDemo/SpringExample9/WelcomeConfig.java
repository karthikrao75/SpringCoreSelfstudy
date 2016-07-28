package com.karthik.SpringDemo.SpringExample9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeConfig {

	@Bean
	public Welcome welcome(){
		return new Welcome();
	}
}
