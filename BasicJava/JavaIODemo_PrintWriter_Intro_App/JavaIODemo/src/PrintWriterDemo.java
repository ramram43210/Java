import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo
{

	public static void main(String[] args) throws IOException

	{
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try
		{
			fileWriter = new FileWriter("myoutputfile.txt");
			printWriter = new PrintWriter(fileWriter);

			printWriter.println(true);
			printWriter.println((int) 123);
			printWriter.println((float) 123.456);

			int intValue = 98;
			double doubleValue = 899.87;
			/*
			 * public PrintWriter printf(String format,
			 * 									Object... args)
			 * 
			 * A convenience method to write a formatted
			 * string to this writer using the specified
			 * format string and arguments.
			 */
			printWriter.printf("i = %d and k = %f", intValue, doubleValue);

			System.out.println("Successfully written to the file."
					+ "please check the file \'myoutputfile.txt\'");

		}
		finally
		{
			if (fileWriter != null)
			{
				fileWriter.close();
			}
			if (printWriter != null)
			{
				printWriter.close();
			}
		}

	}
}
