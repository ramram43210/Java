public class TrimDemo
{

	public static void main(String[] args)
	{
		String str = "    Welcome    ";
		System.out.println("str = " + str);

		/*
		 * public String trim()
		 * 
		 * Returns: 
		 * -------
		 * 
		 * A string whose value is this string, with any
		 * leading and trailing white space removed, or this
		 * string if it has no leading or trailing white
		 * space.
		 */

		String trimedValue = str.trim();
		System.out.println("trimedValue = " + trimedValue);

	}
}
