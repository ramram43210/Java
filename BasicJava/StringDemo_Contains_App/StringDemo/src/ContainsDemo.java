/*
 * public boolean contains(CharSequence s)
 * 
 * Parameters: 
 * ----------  
 * s - the sequence to search for.
 * 
 * Returns: 
 * ------- 
 * Returns true if and only if this string contains
 * the specified sequence of char values.
 */

public class ContainsDemo
{

	public static void main(String[] args)
	{
		String str = "How are you peter?";

		boolean isExist = str.contains("are");
		System.out.println("contains(\"are\") =  " + isExist);

		/*
		 * CharSequence is an interface that is implemented
		 * by the String class. Therefore, you can use a
		 * string as an argument for the contains() method.
		 */

		isExist = str.contains("do");
		System.out.println("contains(\"do\")  =  " + isExist);

	}
}
