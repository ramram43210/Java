import java.io.IOException;
import java.io.PrintWriter;

/*
 * public PrintWriter(String fileName) throws
 * 									FileNotFoundException
 * 
 * Parameters: 
 * ----------
 * 
 * fileName - The name of the file to use as
 * the destination of this writer. If the file exists
 * then it will be truncated to zero size; otherwise, a
 * new file will be created. The output will be written
 * to the file and is buffered.
 */
public class PrintWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter printWriter = null;
		try
		{
			String fileName = "myoutputfile.txt";
			/*
			 * Creates a new PrintWriter, without automatic
			 * line flushing, with the specified file name
			 */
			printWriter = new PrintWriter(fileName);

			int intValue = 10;
			double doubleValue = 50.87;
			printWriter.printf("i = %d and k = %f", intValue, doubleValue);

			System.out.println("Successfully written to the file."
					+ "please check the file \'myoutputfile.txt\'");
		}
		finally
		{

			if (printWriter != null)
			{
				printWriter.close();
			}
		}

	}
}
