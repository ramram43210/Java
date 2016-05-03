
public class ThrowDemo
{
	public static void main(String[] args)
	{
		ThrowDemo throwDemo = new ThrowDemo();
		throwDemo.validateAge(15);
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
			System.out.println("Eligible to apply for Govt Jobs");
		}
	}
}