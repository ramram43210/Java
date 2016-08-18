import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayInputStream byteArrayInputStream = null;

		try
		{
			String str = "Peter is going to India.";
			byte[] byteArray = str.getBytes();
			
			byteArrayInputStream = new ByteArrayInputStream(byteArray);
			int ch;
			while ((ch = byteArrayInputStream.read()) != -1)
			{
				System.out.print((char) ch);
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
