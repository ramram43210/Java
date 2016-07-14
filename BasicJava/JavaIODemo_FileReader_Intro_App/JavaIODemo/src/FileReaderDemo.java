import java.io.FileReader;
import java.io.IOException;

/*
 * public FileReader(String fileName) throws
 *                           FileNotFoundException
 * 
 * Parameters:
 * ----------
 * 
 * fileName - the name of the file to read from
 */
public class FileReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReaderDemo fileReaderDemo = new FileReaderDemo();
		fileReaderDemo.readFile();
	}

	private void readFile() throws IOException
	{
		FileReader fileReader = null;

		try
		{

			/*
			 * Creates a new FileReader, given the name of
			 * the file to read from.
			 */
			String fileName = "myfile.txt";
			fileReader = new FileReader(fileName);
			int i;

			/*
			 * Reads a single character or -1 if the end of
			 * the stream has been reached
			 */
			while ((i = fileReader.read()) != -1)
			{
				System.out.print((char) i);
			}
		}
		finally
		{
			if (fileReader != null)
			{
				/*
				 * Closes the stream and releases any system
				 * resources associated with it. Once the
				 * stream has been closed, further read(),
				 * ready(), mark(), reset(), or skip()
				 * invocations will throw an IOException.
				 * Closing a previously closed stream has no
				 * effect.
				 */
				fileReader.close();
			}
		}
	}

}
