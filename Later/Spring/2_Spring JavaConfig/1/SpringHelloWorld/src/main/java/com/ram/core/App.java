package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.config.AppConfig;
import com.ram.hello.HelloWorld;

public class App
{
	public static void main(String[] args)
	{
		/*
		 * Load the JavaConfig class with
		 * AnnotationConfigApplicationContext.
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		HelloWorld helloWorldObj = (HelloWorld) context.getBean("helloBean");
		helloWorldObj.printHelloWorld("Spring5 Hello world");

	}
}