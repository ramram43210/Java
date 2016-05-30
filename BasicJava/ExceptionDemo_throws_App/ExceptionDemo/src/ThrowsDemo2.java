import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo2
{
	public static void main(String[] args)
	{

		try
		{
			new ThrowsDemo2().getFileInfo();
		}
		catch (FileNotFoundException exe)
		{
			System.out.println("Exception handled inside FileNotFoundException catch block.");
		}
		catch (IOException exe)
		{
			System.out.println("Exception handled inside IOException catch block.");
		}
		catch (Exception exe)
		{
			System.out.println("Exception handled inside Exception catch block.");
		}
		 System.out.println("normal flow...");  

	}

	private void getFileInfo() throws FileNotFoundException,
			IOException, Exception
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the fileName : ");
		String fileName = scanner.nextLine();
		scanner.close();

		/*
		 * Wrap a BufferedReader around FileReader.
		 */
		BufferedReader bufferedReader = new BufferedReader(
				new FileReader(fileName));

		/*
		 * Use the readLine method of the BufferedReader to
		 * read one line at a time. the readLine method
		 * returns null when there is nothing else to read.
		 */
		String line = null;
		
		while ((line = bufferedReader.readLine()) != null)
		{
			System.out.println(line);
		}

		// Close the BufferedReader when we're done.
		bufferedReader.close();
	}

}