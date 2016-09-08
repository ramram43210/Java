import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo
{

	public static void main(String[] args) throws IOException 
	{
		String str = "Hello World";

		StringReader stringReader = null;

		try
		{
			stringReader = new StringReader(str);
			int i = 0;
			while ((i = stringReader.read()) != -1)
			{
				System.out.print((char) i);
			}

		}
		finally
		{
			if (stringReader != null)
			{
				// close the stream
				stringReader.close();

			}
		}
	}

}
