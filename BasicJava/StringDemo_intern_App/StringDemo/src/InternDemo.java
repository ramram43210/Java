/*
 * public String intern()
 *  
 * Returns: 
 * -------
 * a string that has the same contents as 
 * this string, but is guaranteed to be 
 * from a pool of unique strings.
 */
public class InternDemo
{
	public static void main(String[] args)
	{
		String s1 = new String("hello");
		String s2 = "hello";

		/*
		 * returns string from pool, now it will be same as
		 * s2
		 */

		String s3 = s1.intern();
		System.out.println(s3);

		/*
		 * false because reference is different
		 */
		System.out.println(s1 == s2);

		/*
		 * true because reference is same
		 */
		System.out.println(s2 == s3);

	}
}