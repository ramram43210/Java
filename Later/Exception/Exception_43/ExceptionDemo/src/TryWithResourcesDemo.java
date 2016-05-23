import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesDemo
{

	public static void main(String[] args) throws IOException
	{
		try (FileInputStream fileInputStream = new FileInputStream(
				"myfile.txt");
				BufferedInputStream bufferedInputStream = new BufferedInputStream(
						fileInputStream))
		{
			int data = bufferedInputStream.read();
			while (data != -1)
			{
				System.out.print((char) data);
				data = bufferedInputStream.read();
			}
		}

	}

}
