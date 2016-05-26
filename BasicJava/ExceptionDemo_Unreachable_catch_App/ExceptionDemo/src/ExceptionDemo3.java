public class ExceptionDemo3
{
	public static void main(String[] args)
	{

		String firstName = null;

		try
		{
			// It will throw NullPointerException
			System.out.println(firstName.length());
		}

		catch (Exception exception)
		{
			exception.printStackTrace();
		}

		catch (NullPointerException nullPointerException)
		{
			System.out.println("String value is null.");
		}

		String lastName = "Peter";
		String fullName = firstName + lastName;
		System.out.println("fullName = " + fullName);

	}
}
