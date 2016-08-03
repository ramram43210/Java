import java.io.StringReader;

public class StringReaderDemo
{

	public static void main(String[] args) throws Exception
	{
		StringReader stringReader = null;
		try
		{
			String input = "Hello";
			stringReader = new StringReader(input);

			int data;
			while ((data = stringReader.read()) != -1)
			{
				System.out.println((char) data);
			}

		}
		finally
		{
			if (stringReader != null)
			{
				stringReader.close();
			}
		}
	}
}