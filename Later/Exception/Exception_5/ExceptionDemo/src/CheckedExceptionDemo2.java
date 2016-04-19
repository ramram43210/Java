import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo2
{

	// Declare the exception using throws keyword.

	public static void main(String[] args)
			throws FileNotFoundException, IOException
	{
		FileInputStream fis = null;

		/*
		 * This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception
		 */
		fis = new FileInputStream("./myfile.txt");
		int i;

		/*
		 * Method read() of FileInputStream class also
		 * throws a checked exception: IOException
		 */
		while ((i = fis.read()) != -1)
		{
			System.out.print((char) i);
		}

		/*
		 * The method close() closes the file input stream
		 * It throws IOException
		 */
		fis.close();

	}

}
