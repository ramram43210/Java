import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scanner = null;
		double sum = 0;

		try
		{
			scanner = new Scanner(new BufferedReader(new FileReader(
														"myfile.txt")));
			/*
			 * Sets this scanner's locale to the specified
			 * locale.
			 * 
			 * We have to mention the locale, because
			 * thousands separators and decimal symbols are
			 * locale specific. So, the this example would
			 * not work correctly in all locales if we
			 * didn't specify that the scanner should use
			 * the US locale.
			 */
			scanner.useLocale(Locale.US);

			while (scanner.hasNext())
			{
				if (scanner.hasNextDouble())
				{
					double doubleValue = scanner.nextDouble();
					System.out.println("doubleValue = " + doubleValue);
					sum += doubleValue;
				}
				else
				{
					scanner.next();
				}
			}
		}
		finally
		{
			if (scanner != null)
			{
				scanner.close();
			}
		}

		System.out.println("sum = " + sum);
	}
}
