abstract class A
{
	abstract void hi();
	
	void bye()
	{
		System.out.println("Bye...");
	}

}

class B extends A
{
	void hi()
	{
		System.out.println("hi...");
	}

}

