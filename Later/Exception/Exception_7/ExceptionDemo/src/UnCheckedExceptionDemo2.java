import java.util.Scanner;

public class UnCheckedExceptionDemo2
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the index: ");
		int index = scanner.nextInt();

		scanner.close();

		try
		{
			int intArray[] = { 155, 345, 999 };
			System.out.println(intArray[index]);
		}
		catch (ArithmeticException arithmeticException)
		{
			System.out
					.println("Enter the index value less than or equal to 2.");
		}

	}

}
