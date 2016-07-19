import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		CharArrayReader charArrayReader = null;
		try
		{
			char[] chars = "Peter".toCharArray();

			charArrayReader = new CharArrayReader(chars);

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
