import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReaderDemo1 BufferedReaderDemo1 = new BufferedReaderDemo1();
		BufferedReaderDemo1.readFile();
	}

	private void readFile() throws IOException
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try
		{
			fileReader = new FileReader("myinputfile.txt");
			bufferedReader = new BufferedReader(fileReader);

			String line = null;
			/*
			 * Reads a line of text. A line is considered to
			 * be terminated by any one of a line feed
			 * ('\n'), a carriage return ('\r'), or a
			 * carriage return followed immediately by a
			 * linefeed.
			 */
			while ((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}

		finally
		{
			if (fileReader != null)
			{
				fileReader.close();
			}
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}
	}

}
