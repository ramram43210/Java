public class ThrowDemo
{

	public static void main(String[] args)
	{
		getNumber("aaa");
	}

	public static int getNumber(String value)
	{
		if (!value.matches("[0-9]+"))
		{
			throw new ArithmeticException();
		}
		return Integer.parseInt(value);
	}

}
