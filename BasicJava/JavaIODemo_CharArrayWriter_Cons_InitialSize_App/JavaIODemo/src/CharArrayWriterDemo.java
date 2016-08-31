import java.io.CharArrayWriter;
import java.io.IOException;

/*
 * public CharArrayWriter(int initialSize)
 * 
 * Parameters: 
 * ----------
 * 
 * initialSize - an int specifying the initial buffer
 * size.
 */

public class CharArrayWriterDemo
{

	public static void main(String[] args) throws IOException
	{

		int initialSize = 1024;
		/*
		 * Creates a new CharArrayWriter with the specified
		 * initial size.
		 */
		CharArrayWriter charArrayWriter = new CharArrayWriter(initialSize);

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
