import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThorwsDemo
{

	public static void main(String[] args)
	{
		ThorwsDemo throwsDemo = new ThorwsDemo();

		try
		{
			String firstLine = throwsDemo
					.readFirstLineFromFile("myfile.txt");
			System.out.println("firstLine = " + firstLine);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public String readFirstLineFromFile(String path)
			throws IOException

	{
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = br.readLine();
		br.close();
		return line;
	}

}
