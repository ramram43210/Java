import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileWriteDemo
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFileWriteDemo randomAccessFileWriteDemo = new RandomAccessFileWriteDemo();
		randomAccessFileWriteDemo.writeData("myfile.txt", "rw", 20);
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
			randomAccessFile.write(" and Srilanka".getBytes());
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
