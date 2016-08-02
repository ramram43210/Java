import java.util.Scanner;

public class ScannerDemo
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(System.in);
			System.out.print("Enter the first number: ");
			int number1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			int number2 = scanner.nextInt();

			int sum = number1 + number2;
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
