import java.util.Scanner;

/*
 *  Java Scanner class which reads the int, 
 *  string and double value as an input:
 */
public class ScannerDemo
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(System.in);

			System.out.print("Enter your Id: ");
			int rollno = scanner.nextInt();

			System.out.print("Enter your Name: ");
			String name = scanner.next();

			System.out.print("Enter your Weight: ");
			double weight = scanner.nextDouble();

			System.out.println("Id:" + rollno + ", Name:" + name
					+ ", Weight:" + weight);
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
