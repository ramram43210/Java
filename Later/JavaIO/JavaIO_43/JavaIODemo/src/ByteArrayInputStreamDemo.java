import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		String s = "Welcome to India.";
		byte buf[] = s.getBytes();
		byteArrayOutputStream.write(buf);

		System.out.println("Buffer as a string");
		/*
		 * Returns String decoded from the buffer's
		 * contents.
		 */
		String bufferContent = byteArrayOutputStream.toString();
		System.out.println(bufferContent);

		System.out.println("----------------------------------");
		System.out.println("Into array");

		/*
		 * Returns the current contents of this output
		 * stream, as a byte array
		 */
		byte b[] = byteArrayOutputStream.toByteArray();

		for (int i = 0; i < b.length; i++)
		{
			System.out.print((char) b[i]);
		}
	}

}
