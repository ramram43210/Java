import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
 * public int read(byte[] b, int off, int len)
 * 
 * b - the buffer into which the data is read.
 * 
 * off - the start offset in the destination
 * array b 
 * 
 * len - the maximum number of bytes
 * read.
 * 
 * Reads up to len bytes of data into an array
 * of bytes from this input stream.
 */
public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayInputStream byteArrayInputStream = null;

		try
		{
			byte[] srcBuffer = new byte[10];

			int j = 11;
			for (int i = 0; i < srcBuffer.length; i++)
			{
				srcBuffer[i] = (byte) j++;
			}

			System.out.println("All elements form srcBuffer:");
			for (int i = 0; i < srcBuffer.length; i++)
			{
				System.out.print(srcBuffer[i] + " ");
			}

			byteArrayInputStream = new ByteArrayInputStream(srcBuffer);

			byte[] destBuffer = new byte[6];

			/*
			 * We put 4 first elements of the
			 * ByteArrayInputStream instance
			 * 'byteArrayInputStream' to the destBuffer
			 * array, starting at the position with index 2.
			 * This is why the two first indexes will be
			 * '0'.
			 */
			byteArrayInputStream.read(destBuffer, 2, 4);

			System.out.println("\n\nAll elements form destBuffer:");
			for (int i = 0; i < destBuffer.length; i++)
			{
				System.out.print(destBuffer[i] + " ");
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
