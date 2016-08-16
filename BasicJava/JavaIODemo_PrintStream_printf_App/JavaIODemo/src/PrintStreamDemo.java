import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamDemo
{

	public static void main(String[] args) throws IOException

	{
		PrintStream printStream = null;
		try
		{
			printStream = new PrintStream(System.out);
			int intValue = 98;
			double doubleValue = 899.87;
			/*
			 * public PrintStream printf(String format,
			 * 								Object... args)
			 * 
			 * A convenience method to write a formatted
			 * string to this output stream using the
			 * specified format string and arguments.
			 */
			printStream.printf("i = %d and k = %f", intValue, doubleValue);
			Date date = new Date();
			System.out.println();
			/*
			 * Prints an object.
			 */
			printStream.print(date);

		}
		finally
		{
			if (printStream != null)
			{
				printStream.close();
			}
		}

	}
}
