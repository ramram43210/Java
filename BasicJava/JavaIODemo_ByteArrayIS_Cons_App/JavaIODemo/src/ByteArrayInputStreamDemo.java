import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		String str = "abcdefghijklmnopqrstuvwxyz";
		byte[] byteArray = str.getBytes();

		ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray);

		/*
		 * The byteArrayInputStream1 contains all letters.
		 */
		displayContent(byteArrayInputStream1);

		ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArray, 0, 3);

		/*
		 * The byteArrayInputStream2 contains only the first
		 * three letters.
		 */
		displayContent(byteArrayInputStream2);

	}

	private static void displayContent(ByteArrayInputStream byteArrayInputStream)
	{
		int ch;
		while ((ch = byteArrayInputStream.read()) != -1)
		{
			System.out.print((char) ch);
		}
		System.out.println();
	}
}
