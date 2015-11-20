public class ReturnVoidDemo
{
	public static void main(String[] args)
	{

		/*
		 * The return statement exits from the current method, and control flow
		 * returns to where the method was invoked.
		 * 
		 * The return statement has two forms: one that returns a value, and one
		 * that doesn't.
		 * 
		 * To return a value, simply put the value (or an expression that
		 * calculates the value) after the return keyword.
		 */

		ReturnVoidDemo returnVoidDemo = new ReturnVoidDemo();
		returnVoidDemo.calculateTotal(0, 0);
		System.out.println("End---");

	}

	public void calculateTotal(int a, int b)
	{

		if (a == 0 && b == 0)
		{
			/*
			 * When a method is declared void, use the form of return that
			 * doesn't return a value.
			 */
			System.out
					.println("Both a and b are '0',So current method will exist");
			return;
		}

		int totalValue = a + b;
		System.out.println("totalValue :" + totalValue);
	}

}