public class MathDemo
{

	public static void main(String[] args)
	{

		double x = 5.65;
		double y = 16.12;

		/*
		 * Math.E, which is the base of natural logarithms.
		 */
		System.out.printf("The value of " + "e is %.4f%n", Math.E);


		/*
		 * Returns the base of the natural logarithms, e, to
		 * the power of the argument.
		 */

		System.out.printf("exp(%.3f) " + "is %.3f%n", x, Math.exp(x));

		/*
		 * Returns the natural logarithm of the argument.
		 */

		System.out.printf("log(%.3f) is " + "%.3f%n", x, Math.log(x));

		/*
		 * Returns the value of the first argument raised to
		 * the power of the second argument.
		 */

		System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n", x, y,
				Math.pow(x, y));

		/*
		 * Returns the square root of the argument.
		 */
		System.out.printf("sqrt(%.3f) is " + "%.3f%n", x,
				Math.sqrt(x));
	}
}
