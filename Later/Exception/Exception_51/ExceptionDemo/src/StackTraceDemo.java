public class StackTraceDemo
{

	public static void main(String[] args)
	{

		try
		{
			getValue();
		}
		catch (Exception cause)
		{
			StackTraceElement elements[] = cause.getStackTrace();
			for (int i = 0, n = elements.length; i < n; i++)
			{
				System.err.println(elements[i].getFileName() + ":"
						+ elements[i].getLineNumber() + ">> "
						+ elements[i].getMethodName() + "()");
			}
		}

	}

	public static int getValue()
	{
		int a = 0;
		a = 10 / 0;
		return a;
	}

}
