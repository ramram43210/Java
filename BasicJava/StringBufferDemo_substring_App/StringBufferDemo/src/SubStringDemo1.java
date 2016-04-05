/*
 * public String substring(int start, int end)
 * 
 * Parameters: 
 * ---------- 
 * start - The beginning index,inclusive. 
 * 
 * end - The ending index, exclusive.
 * 
 * Returns: 
 * ------- 
 * The new string. 
 * 
 * Throws: 
 * ------
 * StringIndexOutOfBoundsException - if start or end are
 * negative or greater than length(), or start is
 * greater than end.
 */
public class SubStringDemo1
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Welcome");
		String subString = sb.substring(3, 6);
		System.out.println("subString = " + subString);
	}
}
