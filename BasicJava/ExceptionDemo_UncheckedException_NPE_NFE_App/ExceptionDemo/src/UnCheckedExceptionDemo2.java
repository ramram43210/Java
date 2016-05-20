/*
 * If you compile this code, it would compile
 * successfully however when you will run it, it would
 * throw NumberFormatException. That clearly shows that
 * unchecked exceptions are not checked at compile-time,
 * they are being checked at runtime.
 */

public class UnCheckedExceptionDemo2
{
	public static void main(String[] args)
	{
		String str = "abc";
		/*
		 * str is "abc", so it should throw
		 * NumberFormatException
		 */
		int i=Integer.parseInt(str);
		System.out.println(i);
		System.out.println("Normal flow...");
	}

}
