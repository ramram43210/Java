@FunctionalInterface
interface GreetingService
{
	void sayMessage(String message);
}

public class LambdaDemo
{

	public static void main(String[] args)
	{

		// with parenthesis
		GreetingService greetService1 = message ->
		                  System.out.println("Hello " + message);

		// without parenthesis
		GreetingService greetService2 = (message) -> 
		                  System.out.println("Hello " + message);

		greetService1.sayMessage("Peter");
		greetService2.sayMessage("John");
	}

}
