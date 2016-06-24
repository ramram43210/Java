import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReaderDemo2 bufferedReaderDemo2 = new BufferedReaderDemo2();
		bufferedReaderDemo2.readFile();
	}

	private void readFile() throws IOException
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try
		{
			fileReader = new FileReader("myinputfile.txt");
			bufferedReader = new BufferedReader(fileReader);
			int i;
			/*
			 * Reads a single character.
			 */
			while ((i = bufferedReader.read()) != -1)
			{
				System.out.print((char) i);
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
