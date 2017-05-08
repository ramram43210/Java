@FunctionalInterface
interface Dog
{
	public void eat(String foodName1, String foodName2);
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
		 * Java Lambda Expression Example: Multiple Parameters.
		 */
		Dog dog = (foodName1, foodName2) ->
		{
			System.out.println(
					"eating " + foodName1 + " and " + foodName2);
		};
		dog.eat("Mutton", "Biscuit");
	}

}
