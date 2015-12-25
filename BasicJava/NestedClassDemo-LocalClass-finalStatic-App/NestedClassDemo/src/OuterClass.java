public class OuterClass
{

	private String name = "John";

	public void greetInEnglish()
	{
		class SayHello
		{
			/*
			 * We cannot declare static variable [with out final] 
			 * in a local class.
			 * 
			 * A local class can have static members provided that they are
			 * constant variables[final variable]
			 */

			public static final String message = "Welcome";

			public void greet()
			{
				System.out.println(message);
			}
		}

		SayHello sayHello = new SayHello();
		sayHello.greet();

	}
}
