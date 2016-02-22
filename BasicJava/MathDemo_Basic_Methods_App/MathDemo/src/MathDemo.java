public class MathDemo
{

	public static void main(String[] args)
	{

		double a = -200.635;
		double b = 23.74;
		int c = 46, d = 65;

		/*
		 * Returns the absolute value of the argument.
		 */
		System.out.printf(
				"The absolute value " + "of %.3f is %.3f%n", a,
				Math.abs(a));

		/*
		 * Returns the smallest integer that is greater than
		 * or equal to the argument. Returned as a double.
		 */
		System.out.printf("The ceiling of " + "%.2f is %.0f%n", b,
				Math.ceil(b));

		/*
		 * Returns the largest integer that is less than or
		 * equal to the argument. Returned as a double.
		 */
		System.out.printf("The floor of " + "%.2f is %.0f%n", b,
				Math.floor(b));

		/*
		 * Returns the integer that is closest in value to
		 * the argument. Returned as a double.
		 */
		System.out.printf("The rint of %.2f " + "is %.0f%n", b,
				Math.rint(b));

		/*
		 * Returns the larger of the two arguments.
		 */
		System.out.printf("The max of %d and " + "%d is %d%n", c, d,
				Math.max(c, d));

		/*
		 * Returns the smaller of the two arguments.
		 */
		System.out.printf("The min of of %d " + "and %d is %d%n", c,
				d, Math.min(c, d));
	}
}
