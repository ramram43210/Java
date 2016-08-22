import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		String str = "Welcome to India.";
		byte[] byteArray = str.getBytes();
		byteArrayOutputStream.write(byteArray);

		System.out.println("Buffer as a string");
		/*
		 * Returns String decoded from the buffer's
		 * contents.
		 */
		String content = byteArrayOutputStream.toString();
		System.out.println(content);

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
