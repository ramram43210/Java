public class MathDemo
{

	public static void main(String[] args)
	{

		double degrees = 25.0;
		double radians = Math.toRadians(degrees);

		System.out.format("The value of pi " + "is %.4f%n", Math.PI);

		System.out.format("The sine of %.1f " + "degrees is %.4f%n",
				degrees, Math.sin(radians));

		System.out.format(
				"The cosine of %.1f " + "degrees is %.4f%n", degrees,
				Math.cos(radians));

		System.out.format("The tangent of %.1f "
				+ "degrees is %.4f%n", degrees, Math.tan(radians));

		System.out.format("The arcsine of %.4f "
				+ "is %.4f degrees %n", Math.sin(radians),
				Math.toDegrees(Math.asin(Math.sin(radians))));

		System.out.format("The arccosine of %.4f "
				+ "is %.4f degrees %n", Math.cos(radians),
				Math.toDegrees(Math.acos(Math.cos(radians))));

		System.out.format("The arctangent of %.4f "
				+ "is %.4f degrees %n", Math.tan(radians),
				Math.toDegrees(Math.atan(Math.tan(radians))));
	}
}
