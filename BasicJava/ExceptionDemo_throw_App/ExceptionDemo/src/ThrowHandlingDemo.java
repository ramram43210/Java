public class ThrowHandlingDemo
{

	public static void main(String[] args)
	{
		ThrowHandlingDemo throwHandlingDemo = new ThrowHandlingDemo();
		
		try
		{
			throwHandlingDemo.validateAge(15);
		}
		catch(ArithmeticException arithmeticException)
		{
			System.out.println(arithmeticException.getMessage());
		}
		
		System.out.println("Validated..");

	}

	public void validateAge(int age)
	{
		if (age < 25)
		{
			throw new ArithmeticException("Not eligible to apply for Govt Jobs");
		}
		else
		{
			System.out.println("Eligible to apply for Govt Jobs.");
		}
	}

}
