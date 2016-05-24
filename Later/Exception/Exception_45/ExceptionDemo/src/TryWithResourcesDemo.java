import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo
{

	public static void main(String[] args) throws Exception
	{
		TryWithResourcesDemo tryWithResourcesDemo = new TryWithResourcesDemo();
		String firstLine = tryWithResourcesDemo.readFirstLineFromFile("myfile.txt");
		System.out.println("firstLine = "+firstLine);
			
	}

	public String readFirstLineFromFile(String path)
			throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader(
				path)))
		{
			return br.readLine();
		}
	}

}
