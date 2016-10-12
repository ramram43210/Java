import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileDemo randomAccessFileDemo = new RandomAccessFileDemo();
		randomAccessFileDemo.readData("myfile.txt", "rw", 5);
		randomAccessFileDemo.writeData("myfile.txt", "rw", 20);
	}

	private void readData(String fileName, String mode, int position)
			throws FileNotFoundException, IOException
	{
		RandomAccessFile randomAccessFile = null;
		try
		{

			randomAccessFile = new RandomAccessFile(fileName, mode);

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
			 */
			randomAccessFile.seek(position);

			int byteValue;
			while ((byteValue = randomAccessFile.read()) != -1)
			{
				System.out.print((char) byteValue);
			}
		}
		finally
		{
			if (randomAccessFile != null)
			{
				randomAccessFile.close();
			}
		}
	}

	private void writeData(String fileName, String mode, int position)
			throws FileNotFoundException, IOException
	{
		RandomAccessFile randomAccessFile = null;
		try
		{
			randomAccessFile = new RandomAccessFile(fileName, mode);

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
			 */
			randomAccessFile.seek(position);
			randomAccessFile.write(" and Japan ".getBytes());
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
