import java.util.Scanner;

/*
 *  Scanner class with delimiter(-). 
 */
public class ScannerDemo
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		try
		{
			String inputValue = "10-20-30-40";
			scanner = new Scanner(inputValue);
			scanner.useDelimiter("-");

			int sum = 0;
			/*
			 * Returns: true if and only if this scanner's
			 * next token is a valid int value
			 */
			while (scanner.hasNextInt())
			{
				/*
				 * Returns: the int scanned from the input
				 */
				int intValue = scanner.nextInt();
				System.out.println(intValue);
				sum = sum + intValue;
			}
			System.out.println("sum = " + sum);
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
