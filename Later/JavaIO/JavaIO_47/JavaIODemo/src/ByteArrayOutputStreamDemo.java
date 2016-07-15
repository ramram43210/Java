import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{
	/*
	 * Created an instance of ByteArrayOutputStream and
	 * wrote 10 random bytes into it. After that, I turned
	 * the ByteArrayOutputStream instance into a byte array,
	 * using the toByteArray() method, and then printed
	 * every byte using a foreach loop.
	 * 
	 * Using the reset() method to reset the
	 * ByteArrayOutputStream instance. Then, using the
	 * write() method to write four of the elements of
	 * byteArray, starting from the index 4 (which is the
	 * offset).
	 */

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		for (int i = 0; i < 10; i++)
		{
			byteArrayOutputStream.write((byte) (Math.random() * 100));
		}

		byte[] byteArray = byteArrayOutputStream.toByteArray();
		System.out.println("The original array:");
		for (byte b : byteArray)
		{
			System.out.print(b + " ");
		}

		/*
		 * Resets the count field of this byte array output
		 * stream to zero, so that all currently accumulated
		 * output in the output stream is discarded. The
		 * output stream can be used again, reusing the
		 * already allocated buffer space.
		 */
		byteArrayOutputStream.reset();

		/*
		 * Writes len bytes from the specified byte array
		 * starting at offset off to this byte array output
		 * stream.
		 */
		byteArrayOutputStream.write(byteArray, 2, 4);
		System.out.println("\n\nThe new byte array:");
		for (byte b : byteArrayOutputStream.toByteArray())
		{
			System.out.print(b + " ");
		}
	}

}
