public class ChainedExceptionDemo1
{

	public static void main(String[] args)
	{
		try
		{
			getValue();
		}
		catch (MyException myException)
		{
			System.out.println("Cause = " + myException.getCause());
			System.out.println("Message = "
					+ myException.getMessage());
		}
	}

	public static int getValue() throws MyException
	{
		int a = 0;
		try
		{
			a = 10 / 0;
		}
		catch (ArithmeticException arithmeticException)
		{
			MyException myException = new MyException(
					arithmeticException.getMessage(),
					arithmeticException);
			
			throw myException;
		}

		return a;
	}

}
