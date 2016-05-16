/*
 * If you compile this code, it would compile
 * successfully however when you will run it, it would
 * throw ArithmeticException. That clearly shows that
 * unchecked exceptions are not checked at compile-time,
 * they are being checked at runtime.
 */

public class UnCheckedExceptionDemo1
{
	public static void main(String[] args)
	{
		int number1 = 10;
		int number2 = 0;
		/*
		 * Since I'm dividing an integer with 0 it should
		 * throw ArithmeticException
		 */
		int result = number1 / number2;
		System.out.println(result);
	}

}
