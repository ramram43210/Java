package com.ram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ram.hello.HelloWorld;
import com.ram.hello.impl.HelloWorldImpl;

/**
 * Annotate with @Configuration to tell Spring that this is the core
 * Spring configuration file, and define bean via @Bean.
 */
@Configuration
public class AppConfig
{

	@Bean(name = "helloBean")
	public HelloWorld helloWorld()
	{
		return new HelloWorldImpl();
	}

}