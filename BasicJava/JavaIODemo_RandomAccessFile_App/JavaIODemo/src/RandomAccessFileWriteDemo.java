import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileWriteDemo
{
	public static void main(String[] args) throws IOException
	{

		RandomAccessFile randomAccessFile = null;
		try
		{
			/*
			 * Second input parameter to the constructor:
			 * "rw". This is the mode you want to open file
			 * in. "rw" means read/write mode.
			 */
			randomAccessFile = new RandomAccessFile("myfile.txt", "rw");

			/*
			 * Sets the file-pointer offset, measured from
			 * the beginning of this file, at which the next
			 * read or write occurs.
			 */
			randomAccessFile.seek(43);
			randomAccessFile.write("Hydrabad ".getBytes());
			System.out.println("Successfully updated the file content..");
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
