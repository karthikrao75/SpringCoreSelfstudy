package com.karthik.SpringDemo.SpringExample11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(FirstConfig.class)
public class SecondConfig {
@Bean
public B a(){
	return new A();
}

}
