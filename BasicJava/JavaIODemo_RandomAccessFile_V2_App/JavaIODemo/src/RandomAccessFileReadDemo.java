import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReadDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileReadDemo randomAccessFileReadDemo = new RandomAccessFileReadDemo();
		randomAccessFileReadDemo.readData("myfile.txt", "r", 5);
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

}
