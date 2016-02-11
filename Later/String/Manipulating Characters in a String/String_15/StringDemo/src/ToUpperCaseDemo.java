import java.util.Locale;

public class ToUpperCaseDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";

		/*
		 * public String toUpperCase()
		 * 
		 * 
		 * Returns: 
		 * -------
		 * 
		 * the String, converted to uppercase.
		 */

		String strUpper = str.toUpperCase();
		System.out.println("strUpper = " + strUpper);
		

		/*
		 * public String toUpperCase(Locale locale)
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
		 * the String, converted to uppercase.
		 */
		
		strUpper = str.toUpperCase(Locale.ITALIAN);
		System.out.println("strUpper = " + strUpper);
	}
}
