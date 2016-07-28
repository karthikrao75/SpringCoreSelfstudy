package com.karthik.SpringDemo.SpringExample11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FirstConfig {
	@Bean(initMethod="",destroyMethod="")
	@Scope("prototype")
	public A a(){
		return new A();
	}
}
