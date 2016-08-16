import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo2
{

	public static void main(String[] args) throws IOException

	{
		PrintStream printStream = null;
		try
		{
			/*
			 * System.err
			 * ---------
			 * The "standard" error output stream. This
			 * stream is already open and ready to accept
			 * output data. Typically this stream
			 * corresponds to display output or another
			 * output destination specified by the host
			 * environment or user. By convention, this
			 * output stream is used to display error
			 * messages or other information that should
			 * come to the immediate attention of a user
			 * even if the principal output stream, the
			 * value of the variable out, has been
			 * redirected to a file or other destination
			 * that is typically not continuously monitored.
			 */
			printStream = new PrintStream(System.err);
			printStream.println("Error occured.");			
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
