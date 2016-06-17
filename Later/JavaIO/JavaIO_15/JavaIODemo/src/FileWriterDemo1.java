import java.io.FileWriter;
import java.io.IOException;

/*
 * public FileWriter(String fileName) throws IOException
 * 
 * Parameters: 
 * ----------
 * 
 * fileName - String The system-dependent filename.
 */

public class FileWriterDemo1
{

	public static void main(String[] args) throws IOException
	{
		FileWriterDemo1 fileWriterDemo1 = new FileWriterDemo1();
		fileWriterDemo1.writeFile();
	}

	private void writeFile() throws IOException
	{
		FileWriter fileWriter = null;

		try
		{

			/*
			 * Constructs a FileWriter object given a file
			 * name.
			 */
			fileWriter = new FileWriter("myfile.txt");
			/*
			 * Writes a string.
			 */
			fileWriter.write("Peter is going to Japan.");
			System.out
					.println("Successfully written to the file."
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
