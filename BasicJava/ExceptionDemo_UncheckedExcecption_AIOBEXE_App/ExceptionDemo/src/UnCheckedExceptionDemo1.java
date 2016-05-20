/*
 * If you compile this code, it would compile
 * successfully however when you will run it, it would
 * throw ArrayIndexOutOfBoundsException. That clearly shows that
 * unchecked exceptions are not checked at compile-time,
 * they are being checked at runtime.
 */

public class UnCheckedExceptionDemo1
{
	public static void main(String[] args)
	{
		int intArray[] = { 1, 2, 3 };

		/*
		 * intArray has only 3 elements but I'm trying to
		 * display the value of 6th element. It should throw
		 * ArrayIndexOutOfBoundsException
		 */
		System.out.println(intArray[5]);
		System.out.println("Normal flow...");
	}

}
