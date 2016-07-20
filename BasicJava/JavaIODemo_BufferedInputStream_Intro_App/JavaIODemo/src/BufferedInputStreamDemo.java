import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		BufferedInputStreamDemo bufferedInputStreamDemo = new BufferedInputStreamDemo();
		bufferedInputStreamDemo.readFile();
	}

	private void readFile() throws IOException
	{
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("myinputfile.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			int i;
			while ((i = bufferedInputStream.read()) != -1)
			{
				System.out.print((char) i);
			}
		}

		finally
		{
			if (fileInputStream != null)
			{
				fileInputStream.close();
			}
			if (bufferedInputStream != null)
			{
				bufferedInputStream.close();
			}
		}
	}
}
