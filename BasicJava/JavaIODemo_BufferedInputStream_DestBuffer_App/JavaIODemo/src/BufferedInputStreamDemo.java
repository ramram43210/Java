import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * public int read(byte[] b, int off, int len)
 * 
 * Parameters:
 * ----------
 * 
 * b - destination buffer. 
 * off - offset at which to start storing bytes. 
 * len - maximum number of bytes to read.
 */
public class BufferedInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		BufferedInputStreamDemo bufferedInputStreamDemo = new BufferedInputStreamDemo();
		bufferedInputStreamDemo.readFile();
	}

	private void readFile() throws IOException
	{
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("myinputfile.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			byte[] destBuffer = new byte[10];

			/*
			 * Reads bytes from this byte-input stream into
			 * the specified byte array, starting at the
			 * given offset.
			 * 
			 * the number of bytes read, or -1 if the end of
			 * the stream has been reached.
			 */
			int numberOfBytesRead =bufferedInputStream.read(destBuffer, 0, 5);
			System.out.println("numberOfBytesRead = "+numberOfBytesRead);

			for (byte b : destBuffer)
			{
				System.out.print((char) b);
			}

		}

		finally
		{
			if (fileInputStream != null)
			{
				fileInputStream.close();
			}
			if (bufferedInputStream != null)
			{
				bufferedInputStream.close();
			}
		}
	}
}
