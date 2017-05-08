@FunctionalInterface
interface Dog
{
	public void eat();
}

/**
 * 
 * A lambda expression can have zero or any number of arguments.
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		/*
		 * Java Lambda Expression Example: No Parameter.
		 */
		Dog dog = () ->
		{
			System.out.println("eating chicken");
		};
		dog.eat();
	}

}
