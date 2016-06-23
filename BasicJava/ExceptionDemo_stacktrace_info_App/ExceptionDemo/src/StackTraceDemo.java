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
			StackTraceElement stackTraceElements[] = cause.getStackTrace();
			for (int i = 0, n = stackTraceElements.length; i < n; i++)
			{
				System.err.println(stackTraceElements[i].getFileName() + ":"
						+ stackTraceElements[i].getLineNumber() + ">> "
						+ stackTraceElements[i].getMethodName() + "()");
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
