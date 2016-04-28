public class PerformanceTest
{

	/*
	 * String is slow and consumes more memory when you
	 * concat too many strings because every time it creates
	 * new instance.
	 */
	public static String concatenatingWithString()
	{
		String str = "Welcome";
		for (int i = 0; i < 70000; i++)
		{
			str = str + "Peter";
		}
		return str;
	}

	/*
	 * StringBuffer is fast and consumes less memory when
	 * you cancat strings.
	 * 
	 * StringBuffer is faster than String.
	 */
	public static String concatenatingWithStringBuffer()
	{
		StringBuffer sb = new StringBuffer("Welcome");
		for (int i = 0; i < 70000; i++)
		{
			sb.append("Peter");
		}
		return sb.toString();
	}

	/*
	 * StringBuilder is fast and consumes less memory when
	 * you cancat strings.
	 * 
	 * StringBuilder is faster than StringBuffer.
	 */
	public static String concatenatingWithStringBuilder()
	{
		StringBuilder sb = new StringBuilder("Welcome");
		for (int i = 0; i < 70000; i++)
		{
			sb.append("Peter");
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		concatenatingWithString();

		System.out
				.println("Time taken by Concatenating with String       : "
						+ (System.currentTimeMillis() - startTime)
						+ "ms");

		startTime = System.currentTimeMillis();

		concatenatingWithStringBuffer();

		System.out
				.println("Time taken by Concatenating with StringBuffer :  "
						+ (System.currentTimeMillis() - startTime)
						+ "ms");

		startTime = System.currentTimeMillis();

		concatenatingWithStringBuilder();

		System.out
				.println("Time taken by Concatenating with StringBuilder: "
						+ (System.currentTimeMillis() - startTime)
						+ "ms");
	}
}