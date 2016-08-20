import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		String str = "Hello World!";
		byte[] byteArray = str.getBytes();
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

		/*
		 * Returns: 
		 * ------- 
		 * 
		 * The number of remaining bytes
		 * that can be read (or skipped over) from this
		 * input stream without blocking.
		 * 
		 * The value returned is count - pos, which is the
		 * number of bytes remaining to be read from the
		 * input buffer.
		 */
		while (byteArrayInputStream.available() != 0)
		{
			System.out.print(new Character((char) byteArrayInputStream.read()));
		}
	}

}
