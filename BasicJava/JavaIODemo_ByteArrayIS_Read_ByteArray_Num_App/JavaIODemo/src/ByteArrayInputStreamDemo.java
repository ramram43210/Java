import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayInputStream byteArrayInputStream = null;

		try
		{
			byte[] buffer = new byte[5];

			for (int i = 0; i < buffer.length; i++)
			{
				buffer[i] = (byte) i;
			}

			byteArrayInputStream = new ByteArrayInputStream(buffer);

			System.out.println("All the elements in the buffer:");

			int num;
			/*
			 * Read every number inside the buffer using the
			 * read() method, which returns -1 if the end of
			 * the buffer is reached.
			 */
			while ((num = byteArrayInputStream.read()) != -1)
			{
				System.out.print(num + " ");
			}
		}
		finally
		{
			if (byteArrayInputStream != null)
			{
				/*
				 * Closing a ByteArrayInputStream has no
				 * effect. The methods in this class can be
				 * called after the stream has been closed
				 * without generating an IOException.
				 */
				byteArrayInputStream.close();
			}
		}

	}
}
