import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		CharArrayReader charArrayReader = null;
		try
		{
			char[] charArray = new char[]
			{ 'H', 'e', 'l', 'l', 'o', ' ', 'R', 'a', 'm' };
			
			charArrayReader = new CharArrayReader(charArray);
			
			int ch = 0;
			StringBuffer sb = new StringBuffer("");
			while ((ch = charArrayReader.read()) != -1)
			{
				sb.append((char) ch);
			}
			System.out.println("sb = " + sb);

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
