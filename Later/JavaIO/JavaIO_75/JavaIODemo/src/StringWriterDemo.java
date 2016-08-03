import java.io.StringWriter;

public class StringWriterDemo
{

	public static void main(String[] args) throws Exception
	{
		StringWriter stringWriter = null;
		try
		{
			/*
			 * Create a new string writer using the default
			 * initial string-buffer size.
			 */
			stringWriter = new StringWriter();

			// write characters to writer.
			stringWriter.write("Welcome to India");

			/*
			 * Return the buffer's current value as a
			 * string.
			 */
			String str = stringWriter.toString();
			System.out.println("str = " + str);
			/*
			 * Returns: StringBuffer holding the current
			 * buffer value.
			 */
			StringBuffer sb = stringWriter.getBuffer();
			System.out.println("sb = " + sb);

		}
		finally
		{
			if (stringWriter != null)
			{
				stringWriter.close();
			}
		}
	}
}