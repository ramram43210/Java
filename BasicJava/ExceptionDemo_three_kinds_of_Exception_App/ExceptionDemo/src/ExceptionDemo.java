import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		String fileName = null;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the fileName:");
		String value = scanner.next();
		if (value.length() > 5)
		{
			fileName = value;
		}

		scanner.close();

		FileReader fileReader = null;

		// Handle them using try-catch blocks.
		try
		{

			/*
			 * This constructor FileReader(File filename)
			 * throws FileNotFoundException which is a
			 * checked exception
			 */
			fileReader = new FileReader(fileName);
			int i;

			/*
			 * Method read() of FileReader class also throws
			 * a checked exception: IOException
			 */
			while ((i = fileReader.read()) != -1)
			{
				System.out.print((char) i);
			}

		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.out.println("The specified file is not "
					+ "present at the given path.");
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
				 * The method close() closes the
				 * fileReader,It throws IOException
				 */
				if (fileReader != null)
				{
					fileReader.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}
}
