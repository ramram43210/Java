import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/*
 * public PushbackReader(Reader in, int size)
 * 
 * Parameters: 
 * ---------- 
 * in - The reader from which characters will be read 
 * size - The size of the pushback buffer
 */
public class PushbackReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = null;
		PushbackReader pushbackReader = null;
		try
		{
			fileReader = new FileReader("myfile.txt");
			/*
			 * Creates a new pushback reader with a pushback
			 * buffer of the given size.
			 */
			pushbackReader = new PushbackReader(fileReader, 8);

			char[] charArray = new char[10];
			/*
			 * Reads characters into a portion of an array.
			 */
			int numberOfCharsRead = pushbackReader.read(charArray, 0, 5);
			System.out.println("numberOfCharsRead = "+numberOfCharsRead);
			System.out.println(new String(charArray));

			/*
			 * Pushes back a portion of an array of
			 * characters by copying it to the front of the
			 * pushback buffer.
			 */
			pushbackReader.unread(charArray, 0, 5);

			numberOfCharsRead = pushbackReader.read(charArray, 0, 5);
			System.out.println("numberOfCharsRead = "+numberOfCharsRead);
			System.out.println(new String(charArray));

		}
		finally
		{
			if (pushbackReader != null)
			{
				/*
				 * Closing a PushbackReader will also close
				 * the Reader instance from which the
				 * PushbackReader is reading.
				 */
				pushbackReader.close();
			}
		}

	}

}
