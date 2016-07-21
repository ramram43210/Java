import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		CharArrayWriter charArrayWriter = new CharArrayWriter();

		charArrayWriter.write("Welcome to India.");

		/*
		 * Returns: an array of chars copied from the input
		 * data.
		 */
		char[] charArray = charArrayWriter.toCharArray();

		for (char c : charArray)
		{
			System.out.print(c);
		}

	}
}
