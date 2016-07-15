import java.io.FileWriter;
import java.io.IOException;

/*
 * public FileWriter(String fileName, boolean
 *                         append) throws IOException
 * 
 * Parameters:
 * -----------
 * 
 * fileName - String The system-dependent filename.
 * 
 * append - boolean if true, then data will be
 * written to the end of the file rather than the
 * beginning.
 */

public class FileWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		FileWriterDemo fileWriterDemo = new FileWriterDemo();
		fileWriterDemo.writeFile();
	}

	private void writeFile() throws IOException
	{
		FileWriter fileWriter = null;

		try
		{

			/*
			 * Constructs a FileWriter object given a file
			 * name with a boolean indicating whether or not
			 * to append the data written.
			 */
			fileWriter = new FileWriter("myfile.txt", true);
			/*
			 * Writes a string.
			 */
			fileWriter.write("Peter is going to Japan.\n");
			
			System.out.println("Successfully written to the file."
					+ "please check the file content.");
		}
		finally
		{
			if (fileWriter != null)
			{
				/*
				 * Closes the stream, flushing it first.
				 * Once the stream has been closed, further
				 * write() or flush() invocations will cause
				 * an IOException to be thrown. Closing a
				 * previously closed stream has no effect.
				 */
				fileWriter.close();
			}
		}
	}

}
