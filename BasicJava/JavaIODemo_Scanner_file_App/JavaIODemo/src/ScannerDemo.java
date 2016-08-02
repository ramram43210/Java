import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  Scanner reads file. 
 */
public class ScannerDemo
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scanner = null;
		try
		{
			File file = new File("myfile.txt");
			scanner = new Scanner(file);

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
				scanner.close();
			}
		}
	}
}
