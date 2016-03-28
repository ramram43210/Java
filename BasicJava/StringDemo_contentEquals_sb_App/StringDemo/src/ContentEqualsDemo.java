/*
 * public boolean contentEquals(StringBuffer sb)
 * 
 * Parameters: 
 * ---------- 
 * sb - The StringBuffer to compare this String against
 * 
 * Returns: 
 * ------- 
 * true if this String represents the same sequence of
 * characters as the specified StringBuffer, false
 * otherwise
 */
public class ContentEqualsDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome Peter";
		StringBuffer sb1 = new StringBuffer("Welcome Peter");
		StringBuffer sb2 = new StringBuffer("Hello");

		boolean result = str.contentEquals(sb1);
		System.out.println("str.contentEquals(sb1) = " + result);
		result = str.contentEquals(sb2);
		System.out.println("str.contentEquals(sb2) = " + result);

	}

}