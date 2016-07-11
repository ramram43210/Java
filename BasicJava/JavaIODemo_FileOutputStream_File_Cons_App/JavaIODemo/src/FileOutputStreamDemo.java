import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * public FileOutputStream(File file)
 *              throws FileNotFoundException
 *
 * Parameters:
 * ----------
 * file - the file to be opened for writing.
 *
 */
public class FileOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStreamDemo fileOutputStreamDemo = new FileOutputStreamDemo();
		fileOutputStreamDemo.writeFile();
	}

	private void writeFile() throws IOException
	{
		FileOutputStream fileOutputStream = null;

		try
		{
			File file = new File("myfile.txt");

			/*
			 * Creates a file output stream to write to the
			 * file represented by the specified File
			 * object.
			 */

			fileOutputStream = new FileOutputStream(file);
			String str = "Peter is coming to India. ";

			/*
			 * Converting string into byte array
			 */
			byte[] byteArray = str.getBytes();

			/*
			 * Writes b.length bytes from the specified byte
			 * array to this file output stream.
			 */
			fileOutputStream.write(byteArray);
			System.out.println("Successfully written to the file.");
		}
		finally
		{
			if (fileOutputStream != null)
			{
				/*
				 * Closes this file output stream and
				 * releases any system resources associated
				 * with this stream.
				 */
				fileOutputStream.close();
			}
		}
	}

}
