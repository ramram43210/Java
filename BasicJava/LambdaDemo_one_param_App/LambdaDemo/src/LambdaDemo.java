@FunctionalInterface
interface Dog
{
	public void eat(String foodName);
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
		 * Java Lambda Expression Example: Single Parameter.
		 */
		Dog dog = (foodName) ->
		{
			System.out.println("eating " + foodName);
		};
		dog.eat("Mutton");
	}

}
