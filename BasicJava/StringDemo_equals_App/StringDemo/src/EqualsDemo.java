/*
 * public boolean equals(Object anObject)
 * ------------------------------------- 
 * Compares this string to the specified object. The
 * result is true if and only if the argument is not
 * null and is a String object that represents the
 * same sequence of characters as this object.
 * 
 * Overrides: 
 * --------- 
 * equals in class Object
 * 
 * Parameters: 
 * ---------- 
 * anObject - The object to compare this String
 * against
 * 
 * Returns: 
 * ------- 
 * true if the given object represents a String
 * equivalent to this string, false otherwise
 */

public class EqualsDemo
{
	public static void main(String[] args)
	{

		boolean result = "welcome".equals("welcome");
		System.out.println("\"welcome\".equals(\"welcome\") = "
				+ result);

		result = "welcome".equals("WELCOME");
		System.out.println("\"welcome\".equals(\"WELCOME\") = "
				+ result);

		result = "welcome".equals("hello");
		System.out.println("\"welcome\".equals(\"hello\")   = "
				+ result);
	}
}