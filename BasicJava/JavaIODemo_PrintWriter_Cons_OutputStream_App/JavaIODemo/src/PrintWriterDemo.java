import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * public PrintWriter(OutputStream out)
 * 
 * Parameters: 
 * ----------
 * 
 * out - An output stream
 */
public class PrintWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fileOutputStream = null;
		PrintWriter printWriter = null;
		try
		{
			fileOutputStream = new FileOutputStream("myoutputfile.txt");
			/*
			 * Creates a new PrintWriter, without automatic
			 * line flushing, from an existing OutputStream.
			 */
			printWriter = new PrintWriter(fileOutputStream);

			int intValue = 13;
			double doubleValue = 67.8;
			printWriter.printf("i = %d and k = %f", intValue, doubleValue);
			/*
			 * Flushes the stream.
			 */
			printWriter.flush();

			System.out.println("Successfully written to the file."
					+ "please check the file \'myoutputfile.txt\'");

		}
		finally
		{
			if (fileOutputStream != null)
			{
				fileOutputStream.close();
			}
			if (printWriter != null)
			{
				printWriter.close();
			}
		}

	}
}
