import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		InputStreamReaderDemo inputStreamReaderDemo = new InputStreamReaderDemo();
		inputStreamReaderDemo.readData();
	}

	private void readData() throws IOException
	{
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		System.out.print("Enter your name : ");
		try
		{
			inputStreamReader = new InputStreamReader(System.in);
			/*
			 * We are connecting the BufferedReader stream
			 * with the InputStreamReader stream for reading
			 * the line by line data from the keyboard.
			 */
			bufferedReader = new BufferedReader(inputStreamReader);
			String name = bufferedReader.readLine();
			System.out.println("Welcome " + name);
		}
		finally
		{
			if (inputStreamReader != null)
			{
				inputStreamReader.close();
			}
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}

	}

}
