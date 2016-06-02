public class CustomExceptionDemo
{

	public static void main(String[] args)
	{
		try
		{
			CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
			customExceptionDemo.validate(15);
		}
		catch (InvalidAgeException invalidAgeException)
		{
			invalidAgeException.printStackTrace();
			System.out.println("message = "+invalidAgeException.getMessage());
		}

	}

	public void validate(int age) throws InvalidAgeException
	{
		if (age < 25)
		{
			throw new InvalidAgeException("Not a valid age to apply for Govt. jobs");
		}
		else
		{
			System.out.println("Valid age to apply for Govt. jobs");
		}

	}
}
