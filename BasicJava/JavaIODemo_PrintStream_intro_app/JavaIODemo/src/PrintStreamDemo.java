import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fileOutputStream = null;
		PrintStream printStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("myfile.txt");
			printStream = new PrintStream(fileOutputStream);
			/*
			 * Prints an integer and then terminate the
			 * line.
			 */
			printStream.println(2500);
			/*
			 * Prints a String and then terminate the line.
			 */
			printStream.println("Hello Peter");
			/*
			 * Prints a double and then terminate the line.
			 */
			printStream.println(25.988);
			/*
			 * Prints a boolean and then terminate the line.
			 */
			printStream.println(true);
			System.out.println("Successfully written to the file."
					+ "please check the file content");
		}
		finally
		{
			if (fileOutputStream != null)
			{
				fileOutputStream.close();
			}
			if (printStream != null)
			{
				printStream.close();
			}
		}

	}
}
