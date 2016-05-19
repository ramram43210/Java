public class FinallyBlockDemo
{

	public static void main(String[] args)
	{

		try
		{
			String str = null;

			// This line will throw NullPointerException
			System.out.println(str.length());

			// This line will throw ArithmeticException
			int a = 5 / 0;

		}

		catch (ArithmeticException | NullPointerException exe)
		{
			exe.printStackTrace();
		}
		finally
		{
			System.out.println("finally block is called.");
			//clean up code.
		}

	}
}
