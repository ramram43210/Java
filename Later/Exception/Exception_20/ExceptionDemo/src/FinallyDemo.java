import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinallyDemo
{
	public static void main(String[] args)
	{

		BufferedReader bufferedReader = null;

		try
		{

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the fileName : ");
			String fileName = scanner.nextLine();
			scanner.close();

			/*
			 * Wrap a BufferedReader around FileReader.
			 */
			bufferedReader = new BufferedReader(new FileReader(
					fileName));

			/*
			 * Use the readLine method of the BufferedReader
			 * to read one line at a time. the readLine
			 * method returns null when there is nothing
			 * else to read.
			 */
			String line = null;

			while ((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}

		}
		catch (FileNotFoundException fileNotFoundException)
		{
			fileNotFoundException.printStackTrace();
		}
		catch (IOException ioException)
		{
			ioException.printStackTrace();
		}
		finally
		{

			System.out.print("Inside finally block....");
			if (bufferedReader != null)
			{
				// Close the BufferedReader when we're done.
				try
				{
					System.out
							.println(",close the BufferedReader....");
					bufferedReader.close();
				}
				catch (IOException ioException)
				{
					ioException.printStackTrace();
				}
			}
		}

	}
}