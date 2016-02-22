public class FormatNumericExample
{

	public static void main(String[] args)
	{

		System.out.format("%s, %s", "Hello", "world");

		System.out.println("\n---------------------------");

		float floatVar = 90.8f;
		int intVar = 100;
		String stringVar = "Peter";

		System.out
				.format("The value of the float variable is "
						+ "%f, while the value of the integer variable is %d, "
						+ "and the string is %s", floatVar, intVar,
						stringVar);

	}
}
