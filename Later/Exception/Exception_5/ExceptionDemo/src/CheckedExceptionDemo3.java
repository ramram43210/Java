import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo3
{

	public static void main(String[] args)
	{

		FileInputStream fis = null;

		// Handle them using try-catch blocks.
		try
		{

			/*
			 * This constructor FileInputStream(File
			 * filename) throws FileNotFoundException which
			 * is a checked exception
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

		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.out.println("The specified file is not "
					+ "present at the given path");
		}
		catch (IOException ioException)
		{
			System.out.println("I/O error occurred: " + ioException);
		}
		finally
		{
			try
			{
				System.out.println(" \nInside finally block");
				/*
				 * The method close() closes the file input
				 * stream It throws IOException
				 */
				if (fis != null)
				{
					fis.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}
}
