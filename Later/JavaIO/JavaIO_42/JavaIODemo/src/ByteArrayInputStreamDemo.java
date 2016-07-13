import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		String str = "Hello World!";
		byte buff[] = str.getBytes();
		InputStream inputStream = new ByteArrayInputStream(buff);

		/*
		 * The number of remaining bytes that can be read
		 * (or skipped over) from this input stream without
		 * blocking.
		 */
		while (inputStream.available() != 0)
		{
			System.out
					.print(new Character((char) inputStream.read()));

		}
	}

}
