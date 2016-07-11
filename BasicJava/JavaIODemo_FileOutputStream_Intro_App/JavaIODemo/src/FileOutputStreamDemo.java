import java.io.FileOutputStream;
import java.io.IOException;

/*
 public FileOutputStream(String name)
 				throws FileNotFoundException

 Parameters:
 ----------
 name - the system-dependent filename

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
			/*
			 * Creates a file output stream to write to the
			 * file with the specified name.
			 */
			String fileName = "myfile.txt";
			fileOutputStream = new FileOutputStream(fileName);
			String str = "Peter is coming to India";

			/*
			 * Converting string into byte array
			 */
			byte[] byteArray = str.getBytes();

			/*
			 * Writes b.length bytes from the specified byte
			 * array to this file output stream.
			 */
			fileOutputStream.write(byteArray);
			System.out.println("Successfully written to the /'"
					+ fileName + "'/ file.");
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
