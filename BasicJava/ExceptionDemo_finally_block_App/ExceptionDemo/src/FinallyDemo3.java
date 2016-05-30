/*
 *  finally block will be executed, 
 *  Even if exception occurs and handled.
 */

public class FinallyDemo3
{
	public static void main(String args[])
	{
		try
		{
			int b = 30 / 0;
			System.out.println("b = " + b);
		}
		catch (ArithmeticException arithmeticException)
		{
			System.out.println("Divide by zero is not possible.");
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
	}
}
