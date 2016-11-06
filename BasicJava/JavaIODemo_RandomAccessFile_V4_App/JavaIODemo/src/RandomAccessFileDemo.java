import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileDemo randomAccessFileDemo = new RandomAccessFileDemo();
		String str = randomAccessFileDemo.readFromFile("myfile.txt", 5);
		System.out.println(str);
		randomAccessFileDemo.writeToFile("myfile.txt", " and USA", 20);
	}

	private String readFromFile(String fileName, int position)
			throws FileNotFoundException, IOException
	{
		RandomAccessFile randomAccessFile = null;
		String str;
		try
		{

			randomAccessFile = new RandomAccessFile(fileName, "r");

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
			 */
			randomAccessFile.seek(position);

			str = randomAccessFile.readLine();
		}
		finally
		{
			if (randomAccessFile != null)
			{
				randomAccessFile.close();
			}
		}
		return str;
	}

	private void writeToFile(String fileName, String data, int position)
			throws IOException
	{
		{
			RandomAccessFile randomAccessFile = null;
			try
			{
				randomAccessFile = new RandomAccessFile(fileName, "rw");

				/*
				 * Sets the file-pointer offset, measured
				 * from the beginning of this file, at which
				 * the next read or write occurs.
				 */
				randomAccessFile.seek(position);
				randomAccessFile.writeBytes(data);
				System.out.println("Successfully written to the file.");
			}
			finally
			{
				if (randomAccessFile != null)
				{
					randomAccessFile.close();
				}
			}
		}
	}
}
