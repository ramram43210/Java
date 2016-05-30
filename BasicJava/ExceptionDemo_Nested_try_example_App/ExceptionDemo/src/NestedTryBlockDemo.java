public class NestedTryBlockDemo
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a[] = new int[5];
				a[15] = 4;

				int b = 30 / 0;
				System.out.println("b = " + b);
			}
			catch (ArithmeticException arithmeticException)
			{
				arithmeticException.printStackTrace();
			}

			System.out.println("Other statements");
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

		System.out.println("normal flow..");
	}
}
