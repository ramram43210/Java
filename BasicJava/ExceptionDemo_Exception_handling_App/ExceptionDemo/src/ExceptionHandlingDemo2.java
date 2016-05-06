/*
 * With exception handling.
 */
public class ExceptionHandlingDemo2
{

	public static void main(String[] args)
	{
		int intValue = 50;
		System.out.println("intValue = " + intValue);

		double doubleValue = 45.9;
		System.out.println("doubleValue = " + doubleValue);

		try
		{
			String str = null;
			System.out.println("str = " + str.toString());
		}
		catch(Exception exe)
		{
			 System.out.println("String value is null");
		}
		

		float floatValue = 10.f;
		System.out.println("floatValue = " + floatValue);

		long longValue = 45000;
		System.out.println("longValue = " + longValue);

	}

}
