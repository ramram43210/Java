public class PrintfNumericExample
{

	public static void main(String[] args)
	{

		System.out.printf("%s, %s", "Hello", "world");

		System.out.println("\n---------------------------");

		float floatVar = 90.8f;
		int intVar = 100;
		String stringVar = "Peter";

		System.out
				.printf("The value of the float variable is "
						+ "%f, while the value of the integer variable is %d, "
						+ "and the string is %s", floatVar, intVar,
						stringVar);

	}
}
