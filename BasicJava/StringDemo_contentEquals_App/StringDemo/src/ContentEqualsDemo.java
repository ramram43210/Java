/*
 * public boolean contentEquals(CharSequence cs)
 * 
 * Parameters: 
 * ---------- 
 * cs - The sequence to compare this String against
 * 
 * Returns: 
 * ------- 
 * true if this String represents the same sequence of
 * char values as the specified sequence, false
 * otherwise
 */

public class ContentEqualsDemo
{

	public static void main(String[] args)
	{
		String str1 = "Welcome Peter";
		String str2 = "Hi";
		String str3 = "Welcome Peter";

		boolean result = str1.contentEquals(str2);
		System.out.println("\"Welcome Peter\".contentEquals(\"Hi\") = " + result);
		result = str1.contentEquals(str3);
		System.out.println("\"Welcome Peter\".contentEquals(\"Welcome Peter\") = " + result);

	}

}