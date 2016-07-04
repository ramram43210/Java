import java.util.Scanner;

/*
 *  Scanner class with delimiter(-). 
 */
public class ScannerDemo2
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
			while (scanner.hasNext())
			{
				int intValue = scanner.nextInt();
				System.out.println(intValue);
				sum = sum+intValue;
			}
			System.out.println("sum = "+sum);
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
