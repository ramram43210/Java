import java.io.StringReader;

public class StringReaderDemo
{

	public static void main(String[] args) throws Exception
	{
		StringReader stringReader = null;
		try
		{
			String str = "Hello";
			stringReader = new StringReader(str);

			int data;
			while ((data = stringReader.read()) != -1)
			{
				System.out.print((char) data);
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