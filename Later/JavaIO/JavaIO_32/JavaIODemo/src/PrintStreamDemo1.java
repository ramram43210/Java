import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo1
{

	public static void main(String[] args) throws IOException

	{
		PrintStream printStream = null;
		try
		{
			/*
			 * System.out
			 * ----------
			 * The "standard" output stream. This stream is
			 * already open and ready to accept output data.
			 * Typically this stream corresponds to display
			 * output or another output destination
			 * specified by the host environment or user.
			 */
			printStream = new PrintStream(System.out);
			printStream.println(2500);
			printStream.println("Hello Peter");
			printStream.println(25.988);
			printStream.println(true);
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
