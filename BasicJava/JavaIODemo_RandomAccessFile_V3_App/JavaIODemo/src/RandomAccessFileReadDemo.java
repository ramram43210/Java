import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReadDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileReadDemo randomAccessFileReadDemo = new RandomAccessFileReadDemo();
		byte[] byteArray = randomAccessFileReadDemo.readFromFile("myfile.txt",15);
		System.out.println(new String(byteArray));
	}

	private byte[] readFromFile(String fileName, int position)
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

			byteArray = new byte[5];
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

}
