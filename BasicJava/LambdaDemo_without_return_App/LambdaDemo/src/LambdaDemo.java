@FunctionalInterface
interface Add
{
	int addition(int a, int b);
}

/**
 * 
 * In Java lambda expression, if there is only one statement, you may
 * or may not use return keyword.
 * 
 * Java Lambda Expression Example: Without return keyword
 *
 */
public class LambdaDemo
{

	public static void main(String[] args)
	{
		// Lambda expression without return keyword.
		Add add = (a, b) -> (a + b);

		int sum = add.addition(10, 20);
		System.out.println("sum = " + sum);
	}

}
