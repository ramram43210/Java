import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		/*
		 * Returns the current size of the buffer.
		 */
		byteArrayOutputStream.write(("Hello world").getBytes());
		System.out.println("byteArrayOutputStream = " + byteArrayOutputStream);
		System.out.println("size = " + byteArrayOutputStream.size());
		byteArrayOutputStream.close();
	}

}
