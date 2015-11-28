public class VarargsDemoTest
{

	public static void main(String[] args)
	{

		calculateTotal(2, 2);
		System.out.println("--------------");
		calculateTotal(3, 3, 3, 3);
		System.out.println("--------------");

	}

	/*
	 * We can use varargs when you don't know how many of a particular type of
	 * argument will be passed to the method.
	 * 
	 * It's a shortcut to creating an array manually.
	 * 
	 * To use varargs, you follow the type of the last parameter by an ellipsis
	 * (three dots, ...), then a space, and the parameter name.The method can
	 * then be called with any number of that parameter, including none.
	 */
	public static void calculateTotal(int... intVarArgs)
	{
		int total = 0;
		for (int intValue : intVarArgs)
		{
			System.out.println("intValue :" + intValue);
			total = total + intValue;
		}

		System.out.println("\ntotal : " + total);

	}

}
