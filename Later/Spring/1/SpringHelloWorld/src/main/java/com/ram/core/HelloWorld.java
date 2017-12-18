package com.ram.core;

/**
 * Spring bean
 *
 */
public class HelloWorld
{
	private String name;

	public void setName(String name)
	{
		System.out.println("setName(String name) method is called, "+name);
		this.name = name;
	}

	public void printHello()
	{
		System.out.println("Spring 5 : Hello World! " + name);
	}
}
