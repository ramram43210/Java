public class ExceptionDemo1
{
	public static void main(String[] args)
	{
		String firstName = null;

		// May throw an Exception
		System.out.println(firstName.length());

		String lastName = "Peter";
		String fullName = firstName + lastName;
		System.out.println("fullName = " + fullName);
	}

}
