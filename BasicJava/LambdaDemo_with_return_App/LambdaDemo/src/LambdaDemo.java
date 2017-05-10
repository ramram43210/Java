@FunctionalInterface
interface Add
{
	int addition(int a, int b);
}

/**
 * 
 * You must use return keyword when lambda expression contains
 * multiple statements.
 * 
 * Java Lambda Expression Example: With return keyword
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		// Lambda expression with return keyword.
		Add add = (int a, int b) ->
		{
			int sum = a + b;
			return sum;
		};

		int sum = add.addition(13, 53);
		System.out.println("sum = " + sum);
	}

}
