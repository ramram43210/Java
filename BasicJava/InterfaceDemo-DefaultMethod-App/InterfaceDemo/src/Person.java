interface Person
{
	
	void walk();
	
	default void sayHello()
	{
		System.out.println("default Hello...");
	}
}
