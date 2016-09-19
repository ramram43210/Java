import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fileInputStream = null;
		PushbackInputStream pushbackInputStream = null;
		try
		{
			fileInputStream = new FileInputStream("myfile.txt");
			pushbackInputStream = new PushbackInputStream(fileInputStream);

			/*
			 * Reads the next byte of data from this input
			 * stream.
			 */
			int data = pushbackInputStream.read();
			System.out.println((char) data);

			/*
			 * Pushes back a byte by copying it to the front
			 * of the pushback buffer.
			 */
			pushbackInputStream.unread(data);

			data = pushbackInputStream.read();
			System.out.println((char) data);

		}
		finally
		{
			if (pushbackInputStream != null)
			{
				/*
				 * Closing a pushbackInputStream will also
				 * close the FileInputStream instance from
				 * which the PushbackReader is reading.
				 */
				pushbackInputStream.close();
			}
		}

	}

}
