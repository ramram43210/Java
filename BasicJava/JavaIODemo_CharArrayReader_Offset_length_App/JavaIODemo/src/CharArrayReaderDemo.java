import java.io.CharArrayReader;
import java.io.IOException;

/*
 * public CharArrayReader(char[] buf, int offset, int length)
 * 
 * Parameters:
 * ----------- 
 * 
 * buf - Input buffer (not copied) 
 * offset - Offset of the first char to read 
 * length - Number of chars to read
 */

public class CharArrayReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		CharArrayReader charArrayReader = null;
		try
		{

			char[] charArray = "Peter won the match".toCharArray();

			/*
			 * Creates a CharArrayReader from the specified
			 * array of chars.
			 * 
			 * The resulting reader will start reading at
			 * the given offset. The total number of char
			 * values that can be read from this reader will
			 * be either length or buf.length-offset,
			 * whichever is smaller.
			 */
			charArrayReader = new CharArrayReader(charArray, 14, 5);

			int i;
			while ((i = charArrayReader.read()) != -1)
			{
				System.out.print((char) i);
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
