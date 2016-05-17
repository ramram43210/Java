public class TryBlockDemo2
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

		catch (ArithmeticException arithmeticException)
		{
			arithmeticException.printStackTrace();
		}

		catch (NullPointerException nullPointerException)
		{
			nullPointerException.printStackTrace();
			
		}

		System.out.println("Normal flow---");

	}
}
