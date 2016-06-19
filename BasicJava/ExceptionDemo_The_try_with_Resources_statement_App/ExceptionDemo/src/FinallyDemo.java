import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo
{

	public static void main(String[] args) throws IOException
	{
		FinallyDemo finallyDemo = new FinallyDemo();
		String firstLine = finallyDemo.readFirstLineFromFile("myfile.txt");
		System.out.println("firstLine = "+firstLine);

	}
	
	public String readFirstLineFromFile(String path)
			throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(path));
		try
		{
			return br.readLine();
		}
		finally
		{
			 if (br != null)
			 {
				 br.close();
			 }
		}
	}
}
