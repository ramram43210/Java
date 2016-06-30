import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo2
{

	public static void main(String[] args) throws IOException
	{
		InputStreamReaderDemo2 inputStreamReaderDemo2 = new InputStreamReaderDemo2();
		inputStreamReaderDemo2.readData();
	}

	private void readData() throws IOException
	{
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;

		try
		{
			inputStreamReader = new InputStreamReader(System.in);
			/*
			 * We are connecting the BufferedReader stream
			 * with the InputStreamReader stream for reading
			 * the line by line data from the keyboard.
			 */
			bufferedReader = new BufferedReader(inputStreamReader);

			String name = "";
			while (!name.equals("stop"))
			{
				System.out.print("Enter data : ");
				name = bufferedReader.readLine();
				System.out.println("data is : " + name);
			}

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
