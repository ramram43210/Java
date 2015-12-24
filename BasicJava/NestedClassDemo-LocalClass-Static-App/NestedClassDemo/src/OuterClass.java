public class OuterClass
{

	private String name = "John";

	public void greetInEnglish()
	{
		class SayHello
		{
			/*
			 * We cannot declare static variable or static methods in a local
			 * class.
			 */

			public static String message = "Welcome";

			public static void greet()
			{
				System.out.println(message);
			}
		}

		SayHello sayHello = new SayHello();
		sayHello.greet();

	}
}
