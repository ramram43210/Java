import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReadDemo
{
	public static void main(String[] args) throws IOException
	{

		RandomAccessFile randomAccessFile = null;
		try
		{
			/*
			 * Second input parameter to the constructor:
			 * "r". This is the mode you want to open file
			 * in. "r" means read mode.
			 */
			randomAccessFile = new RandomAccessFile("myfile.txt", "r");

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
			 */
			randomAccessFile.seek(57);

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
