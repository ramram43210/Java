import java.util.Scanner;

public class FinallyDemo
{
	public static void main(String args[])
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the value of a : ");
			int a = scanner.nextInt();
			System.out.print("Enter the value of b : ");
			int b = scanner.nextInt();
			scanner.close();
			int c = a / b;
			System.out.println("c = " + c);
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
	}
}
