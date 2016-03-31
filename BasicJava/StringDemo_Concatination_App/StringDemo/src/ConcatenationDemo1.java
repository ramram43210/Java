public class ConcatenationDemo1
{

	public static void main(String[] args)
	{
		/*
		 * String concatenation operator produces a new
		 * string by appending the second operand onto the
		 * end of the first operand.
		 */
		String string1 = "Hello" + " World";
		System.out.println(string1);// Hello World

		/*
		 * The string concatenation operator can concat not
		 * only string but primitive values also.
		 */
		String string2 = 50 + 30 + "Hello" + 40 + 40;
		System.out.println(string2);// 80Sachin4040

	}
}
