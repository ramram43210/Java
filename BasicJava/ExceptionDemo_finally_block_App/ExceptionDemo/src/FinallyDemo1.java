/*
 *  finally block will be executed, 
 *  Even if exception not occur.
 */

public class FinallyDemo1
{
	public static void main(String args[])
	{
		try
		{
			int b = 30 / 5;
			System.out.println("b = " + b);
		}
		catch (ArithmeticException arithmeticException)
		{
			arithmeticException.printStackTrace();
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
	}
}
