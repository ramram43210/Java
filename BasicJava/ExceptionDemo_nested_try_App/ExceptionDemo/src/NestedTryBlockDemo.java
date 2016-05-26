public class NestedTryBlockDemo
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int b = 30 / 0;
				System.out.println("b = " + b);
			}
			catch (ArithmeticException arithmeticException)
			{
				arithmeticException.printStackTrace();
			}

			int a[] = new int[5];
			a[15] = 4;

			System.out.println("Other statements");
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

		System.out.println("normal flow..");
	}
}
