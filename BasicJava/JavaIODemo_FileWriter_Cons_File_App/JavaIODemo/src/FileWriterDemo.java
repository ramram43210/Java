import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * public FileWriter(File file) throws IOException
 * 
 * Parameters: 
 * ----------
 * 
 * file - a File object to write to.
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

			File file = new File("myfile.txt");

			/*
			 * Constructs a FileWriter object given a file
			 * name.
			 */
			fileWriter = new FileWriter(file);
			/*
			 * Writes a string.
			 */
			fileWriter.write("Welcome to America.");
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
