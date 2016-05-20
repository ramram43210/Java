import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandlingDemo
{

	public static void main(String[] args)
	{
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream("myfile.txt");
			int data = fileInputStream.read();
			while (data != -1)
			{
				System.out.print((char) data);
				data = fileInputStream.read();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (fileInputStream != null)
			{
				try
				{
					fileInputStream.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
}
