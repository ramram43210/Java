public class PerformanceTest
{

	/*
	 * String is slow and consumes more memory when you
	 * concat too many strings because every time it creates
	 * new instance.
	 */
	public static String concatWithString()
	{
		String str = "Welcome";
		for (int i = 0; i < 10000; i++)
		{
			str = str + "Peter";
		}
		return str;
	}

	/*
	 * StringBuffer is fast and consumes less memory when
	 * you cancat strings.
	 */
	public static String concatWithStringBuffer()
	{
		StringBuffer sb = new StringBuffer("Welcome");
		for (int i = 0; i < 10000; i++)
		{
			sb.append("Peter");
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		concatWithString();

		System.out.println("Time taken by Concating with String       : "
				+ (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();

		concatWithStringBuffer();

		System.out
				.println("Time taken by Concating with  StringBuffer: "
						+ (System.currentTimeMillis() - startTime)
						+ "ms");
	}
}