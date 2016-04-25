public class ExceptionDemo2
{
	public static void main(String[] args)
	{
		String firstName = null;
		
		try
		{
		  // May throw an Exception	
		  System.out.println(firstName.length());
		}
		catch(NullPointerException nullPointerException)
		{
			System.out.println("String is null");
		}
		
		String lastName = "Peter";
		String fullName = firstName+lastName;
		System.out.println("fullName = "+fullName);	
	}

}
