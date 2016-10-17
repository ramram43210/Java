import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/*
 * public PushbackInputStream(InputStream in, int size)
 * 
 * Parameters:
 * -----------
 * 
 * in - the input stream from which bytes will be read.
 * size - the size of the pushback buffer.
 */
public class PushbackInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fileInputStream = null;
		PushbackInputStream pushbackInputStream = null;
		try
		{
			fileInputStream = new FileInputStream("myfile.txt");

			/*
			 * Creates a PushbackInputStream with a pushback
			 * buffer of the specified size, and saves its
			 * argument, the input stream in, for later use.
			 */
			pushbackInputStream = new PushbackInputStream(fileInputStream, 8);

			byte[] byteArray = new byte[10];
			
			/*
			 * Reads up to len bytes of data from this input
			 * stream into an array of bytes.
			 */
			int numberOfBytesRead = pushbackInputStream.read(byteArray, 0, 5);
		
			System.out.println("numberOfBytesRead = "+numberOfBytesRead);
			System.out.println(new String(byteArray));

			/*
			 * Pushes back a portion of an array of bytes by
			 * copying it to the front of the pushback
			 * buffer.
			 */
			pushbackInputStream.unread(byteArray, 0, 5);

			numberOfBytesRead = pushbackInputStream.read(byteArray, 0, 5);
			System.out.println("numberOfBytesRead = "+numberOfBytesRead);
			System.out.println(new String(byteArray));

		}
		finally
		{
			if (pushbackInputStream != null)
			{
				/*
				 * Closing a PushbackInputStream will also
				 * close the Reader instance from which the
				 * PushbackInputStream is reading.
				 */
				pushbackInputStream.close();
			}
		}
	}

}
