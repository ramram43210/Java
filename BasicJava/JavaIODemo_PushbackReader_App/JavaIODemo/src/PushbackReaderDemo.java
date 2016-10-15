import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = null;
		PushbackReader pushbackReader = null;
		try
		{
			fileReader = new FileReader("myfile.txt");
			pushbackReader = new PushbackReader(fileReader);
			int data = pushbackReader.read();
			System.out.println((char) data);

			/*
			 * Pushes back a single character by copying it
			 * to the front of the pushback buffer. After
			 * this method returns, the next character to be
			 * read will have the value (char)c.
			 */
			pushbackReader.unread(data);

			/*
			 * Reads a single character.
			 */
			data = pushbackReader.read();
			System.out.println((char) data);

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
