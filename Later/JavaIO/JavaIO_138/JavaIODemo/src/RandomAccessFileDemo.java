import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileDemo randomAccessFileDemo = new RandomAccessFileDemo();
		byte[] byteArray = randomAccessFileDemo.readFromFile("myfile.txt", 15,
				5);
		System.out.println(new String(byteArray));
		randomAccessFileDemo.writeToFile("myfile.txt", " and USA", 20);
	}

	private byte[] readFromFile(String fileName, int position, int size)
			throws FileNotFoundException, IOException
	{
		RandomAccessFile randomAccessFile = null;
		byte[] byteArray;
		try
		{

			randomAccessFile = new RandomAccessFile(fileName, "r");

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
			 */
			randomAccessFile.seek(position);

			byteArray = new byte[size];
			randomAccessFile.read(byteArray);
		}
		finally
		{
			if (randomAccessFile != null)
			{
				randomAccessFile.close();
			}
		}
		return byteArray;
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
				randomAccessFile.write(data.getBytes());
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
