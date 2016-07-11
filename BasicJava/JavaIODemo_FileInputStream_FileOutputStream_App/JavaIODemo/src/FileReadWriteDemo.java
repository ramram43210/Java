import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteDemo
{

	public static void main(String[] args) throws IOException
	{
		FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
		fileReadWriteDemo.readAndWriteFile();
	}

	private void readAndWriteFile() throws IOException
	{
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try
		{
			/*
			 * Creates a FileInputStream by opening a
			 * connection to an actual file, the file named
			 * by the path name name in the file system.
			 */
			String inputFileName = "myinputfile.txt";
			fileInputStream = new FileInputStream(inputFileName);
			/*
			 * Creates a file output stream to write to the
			 * file with the specified name.
			 */
			String outputFileName = "myoutputfile.txt";
			fileOutputStream = new FileOutputStream(outputFileName);
			int i;

			/*
			 * Reads a byte of data from this input stream.
			 */
			while ((i = fileInputStream.read()) != -1)
			{
				/*
				 * Writes the specified byte to this file
				 * output stream.
				 */
				fileOutputStream.write(i);
			}

			System.out
					.println("Successfully read and "
							+ "writen to the \'" + outputFileName
							+ "\'file.");
		}
		finally
		{
			if (fileInputStream != null)
			{
				/*
				 * Closes this file input stream and
				 * releases any system resources associated
				 * with the stream.
				 */
				fileInputStream.close();
			}
			if (fileOutputStream != null)
			{
				/*
				 * Closes this file output stream and
				 * releases any system resources associated
				 * with this stream.
				 */
				fileOutputStream.close();
			}
		}
	}

}
