/*
 * If you compile this code, it would compile
 * successfully however when you will run it, it would
 * throw NullPointerException. That clearly shows that
 * unchecked exceptions are not checked at compile-time,
 * they are being checked at runtime.
 */

public class UnCheckedExceptionDemo1
{
	public static void main(String[] args)
	{
		String str = null;
		/*
		 * str is null, so it should throw
		 * NullPointerException
		 */
		System.out.println(str.isEmpty());
		System.out.println("Normal flow...");
	}

}
