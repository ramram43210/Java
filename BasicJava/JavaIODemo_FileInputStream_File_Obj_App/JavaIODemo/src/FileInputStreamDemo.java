import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * public FileInputStream(File file) throws
 *                          FileNotFoundException
 * 
 * Parameters: 
 * ----------
 * 
 * file - the file to be opened for reading.
 */

public class FileInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
		fileInputStreamDemo.readFile();
	}

	private void readFile() throws IOException
	{
		FileInputStream fileInputStream = null;

		try
		{
			File file = new File("myfile.txt");
			/*
			 * Creates a FileInputStream by opening a
			 * connection to an actual file, the file named
			 * by the File object file in the file system.
			 */
			fileInputStream = new FileInputStream(file);
			int i;

			/*
			 * Reads a byte of data from this input stream.
			 */
			while ((i = fileInputStream.read()) != -1)
			{
				System.out.print((char) i);
			}
		}
		finally
		{
			if (fileInputStream != null)
			{
				/*
				 * Closes this file input stream and
				 * releases any system resources associated
				 * with the stream.
				 */
				fileInputStream.close();
			}
		}
	}

}
