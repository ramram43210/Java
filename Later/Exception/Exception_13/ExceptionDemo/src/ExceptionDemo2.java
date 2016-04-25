public class ExceptionDemo2
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 0;
		try
		{
			int c = a / b;
		}
		catch (ArithmeticException arithmeticException)
		{
			System.out.println("Divided by zero is not possible");
		}
		System.out.println("Welcome");
		System.out.println("Hello");
	}

}
