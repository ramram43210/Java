import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		byteArrayOutputStream.write("Hello world".getBytes());
		System.out.println("byteArrayOutputStream = " + byteArrayOutputStream);

		/*
		 * Returns the current size of the buffer.
		 */

		System.out.println("size = " + byteArrayOutputStream.size());
		byteArrayOutputStream.close();
	}

}
