/*
 * public String toLowerCase()
 * 
 * Returns: 
 * ------- 
 * the String, converted to lowercase.
 * 
 * ============================================
 * 
 * public String toLowerCase(Locale locale)
 * 
 * Parameters: 
 * ---------- 
 * locale - use the case transformation rules for
 * this locale.
 * 
 * Returns: 
 * ------- 
 * the String, converted to lowercase.
 */

import java.util.Locale;

public class ToLowerCaseDemo
{

	public static void main(String[] args)
	{
		String str1 = "WELCOME";
		String strLower1 = str1.toLowerCase();
		System.out.println("strLower1 = " + strLower1);

		String str2 = "HELLO";
		String strLower2 = str2.toLowerCase(Locale.CANADA);
		System.out.println("strLower2 = " + strLower2);

	}

}
