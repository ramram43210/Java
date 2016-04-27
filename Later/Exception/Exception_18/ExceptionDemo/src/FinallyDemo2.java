/*
 *  finally block will be executed, even exception 
 *  occurs and it is not handled,
 */

public class FinallyDemo2
{
	public static void main(String args[])
	{
		try
		{
			int b = 30 / 0;
			System.out.println("b = " + b);
		}
		catch (IndexOutOfBoundsException indexOutOfBoundsException)
		{
			indexOutOfBoundsException.printStackTrace();
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
	}
}
