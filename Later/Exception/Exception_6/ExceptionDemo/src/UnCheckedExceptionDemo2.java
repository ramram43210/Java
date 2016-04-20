import java.util.Scanner;

public class UnCheckedExceptionDemo2
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number1:\t");
		int number1 = scanner.nextInt();

		System.out.print("Enter number2:\t");
		int number2 = scanner.nextInt();

		scanner.close();

		try
		{
			int result = number1 / number2;
			System.out.println(result);
		}
		catch (ArithmeticException arithmeticException)
		{
			System.out
					.println("Cannot divide an interger with zero."
							+ "So please enter number2 value greater then zero.");
		}

	}

}
