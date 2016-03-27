/*
 * public char[] toCharArray()
 * 
 * 
 * Returns: 
 * --------
 * 
 * a newly allocated character array whose length is the
 * length of this string and whose contents are
 * initialized to contain the character sequence
 * represented by this string.
 */
public class ToCharArrayDemo
{

	public static void main(String[] args)
	{
		String str = "Welcome";
		char[] charArray = str.toCharArray();
		for (char c : charArray)
		{
			System.out.println(c);
		}
	}

}