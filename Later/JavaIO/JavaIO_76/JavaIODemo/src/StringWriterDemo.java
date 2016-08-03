import java.io.StringWriter;

/*
 * public StringWriter(int initialSize)
 * 
 * Parameters: 
 * ----------
 * 
 * initialSize - The number of char values that will fit
 * into this buffer before it is automatically expanded
 */

public class StringWriterDemo
{

	public static void main(String[] args) throws Exception
	{
		StringWriter stringWriter = null;
		try
		{
			/*
			 * Create a new string writer using the
			 * specified initial string-buffer size.
			 */
			stringWriter = new StringWriter(32);

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