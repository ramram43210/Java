import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * public PrintWriter(File file) throws
 * 							FileNotFoundException
 * 
 * Parameters: 
 * ----------
 * 
 * file - The file to use as the destination
 * of this writer. If the file exists then it will be
 * truncated to zero size; otherwise, a new file will be
 * created. The output will be written to the file and
 * is buffered.
 */

public class PrintWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter printWriter = null;
		try
		{
			File file = new File("myoutputfile.txt");
			/*
			 * Creates a new PrintWriter, without automatic
			 * line flushing, with the specified file.
			 */
			printWriter = new PrintWriter(file);

			int intValue = 100;
			double doubleValue = 200.6;
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
