import java.io.FileInputStream;
import java.io.IOException;

/*
 * public FileInputStream(String name) throws
 * 							FileNotFoundException
 *  
 * Parameters:
 * ----------
 *  
 * name - the system-dependent file name.
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
			/*
			 * Creates a FileInputStream by opening a
			 * connection to an actual file, the file named
			 * by the path name name in the file system.
			 */
			fileInputStream = new FileInputStream("myfile.txt");
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
