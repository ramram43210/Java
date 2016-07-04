import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 *  Scanner reads file. 
 */
public class ScannerDemo4
{

	public static void main(String[] args)
			throws FileNotFoundException
	{
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(new BufferedReader(new FileReader(
					"myfile.txt")));

			while (scanner.hasNext())
			{
				String strValue = scanner.nextLine();
				System.out.println(strValue);
			}

		}
		finally
		{
			if (scanner != null)
			{
				/*
				 * Scanner's close method when it is done
				 * with the scanner object. Even though a
				 * scanner is not a stream, you need to
				 * close it to indicate that you're done
				 * with its underlying stream.
				 */
				scanner.close();
			}
		}
	}
}
