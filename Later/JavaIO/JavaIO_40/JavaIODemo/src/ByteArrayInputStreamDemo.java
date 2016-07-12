import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
 * Another simple usage of ByteArrayInputStream would be
 * a way of capitalizing the input from the user.
 */

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		String tmp = "abcdefghijklmnopqrstuvwxyz";

		byte byteArray[] = tmp.getBytes();

		ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(
				byteArray);

		/*
		 * The byteArrayInputStream1 object contains the
		 * entire lowercase alphabet.
		 */
		displayContent(byteArrayInputStream1);

		ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(
				byteArray, 0, 3);

		/*
		 * The byteArrayInputStream2 contains only the first
		 * three letters.
		 */
		displayContent(byteArrayInputStream2);

	}

	private static void displayContent(
			ByteArrayInputStream byteArrayInputStream)
	{
		int ch;
		while ((ch = byteArrayInputStream.read()) != -1)
		{
			System.out.print((char) ch);
		}
		System.out.println();
	}
}
