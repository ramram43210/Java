import java.util.Locale;

public class ToLowerCaseDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		/*
		 * public String toLowerCase()
		 * 
		 * 
		 * Returns: 
		 * -------
		 * 
		 * the String, converted to lowercase.
		 */

		String strLower = str.toLowerCase();
		System.out.println("strLower = " + strLower);		

		/*
		 * public String toLowerCase(Locale locale)
		 * 
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * locale - use the case transformation rules for
		 * this locale.
		 * 
		 * Returns: 
		 * -------
		 * 
		 * the String, converted to lowercase.
		 */
		
		strLower = str.toLowerCase(Locale.CANADA);
		System.out.println("strLower = " + strLower);

	}

}
