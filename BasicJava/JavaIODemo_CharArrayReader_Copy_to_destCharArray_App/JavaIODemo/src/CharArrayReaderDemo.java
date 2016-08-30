import java.io.CharArrayReader;
import java.io.IOException;

/*
 * public int read(char[] b, int off, int len)
 * 								throws IOException
 * 
 * Parameters:
 * ----------
 *  
 * b - Destination buffer 
 * off - Offset at which to start storing characters
 * len - Maximum number of characters to read
 */

public class CharArrayReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		CharArrayReader charArrayReader = null;
		try
		{

			char[] srcCharArray = "Peter won the match".toCharArray();

			charArrayReader = new CharArrayReader(srcCharArray);

			char[] destCharArray = new char[10];

			/*
			 * Reads characters into a portion of an array.
			 * 
			 * Returns: The actual number of characters
			 * read, or -1 if the end of the stream has been
			 * reached
			 */
			int numberOfCharsRead = charArrayReader.read(destCharArray, 0, 5);
			System.out.println("numberOfCharsRead = " + numberOfCharsRead);

			for (int i = 0; i < destCharArray.length; i++)
			{
				System.out.print(destCharArray[i]);
			}

		}
		finally
		{
			if (charArrayReader != null)
			{
				charArrayReader.close();
			}
		}

	}

}
