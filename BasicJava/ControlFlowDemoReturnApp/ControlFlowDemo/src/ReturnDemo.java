public class ReturnDemo
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

		ReturnDemo returnDemo = new ReturnDemo();
		int totalValue = returnDemo.getTotal(10, 10);
		System.out.println("totalValue : " + totalValue);

	}

	public int getTotal(int a, int b)
	{
		int c = a + b;
		/*
		 * The data type of the returned value must match the type of the
		 * method's declared return value.
		 */
		return c;
	}

}