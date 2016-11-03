import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileWriteDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileWriteDemo randomAccessFileWriteDemo = new RandomAccessFileWriteDemo();
		randomAccessFileWriteDemo.writeToFile("myfile.txt", " and USA", 20);
	}

	private void writeToFile(String fileName, String data, int position)
			throws IOException
	{

		RandomAccessFile randomAccessFile = null;
		try
		{
			randomAccessFile = new RandomAccessFile(fileName, "rw");

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
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
