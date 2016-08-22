import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{
	/*
	 * Created an instance of ByteArrayOutputStream and
	 * wrote 5 random bytes into it. After that, I turned
	 * the ByteArrayOutputStream instance into a byte array,
	 * using the toByteArray() method, and then printed
	 * every byte using a foreach loop.
	 */

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		for (int i = 0; i < 5; i++)
		{
			byteArrayOutputStream.write((byte) (Math.random() * 100));
		}

		/*
		 * Returns: 
		 * -------- 
		 * the current contents of this output stream, as a byte array.
		 */
		byte[] byteArray = byteArrayOutputStream.toByteArray();
		for (byte b : byteArray)
		{
			System.out.print(b + " ");
		}
	}

}
