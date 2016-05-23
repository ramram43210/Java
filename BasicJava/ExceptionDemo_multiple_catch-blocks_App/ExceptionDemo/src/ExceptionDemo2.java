import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDemo2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the index : ");
		int index = scanner.nextInt();
		scanner.close();

		ArrayList<String> list = new ArrayList<String>();
		list.add("Dave");
		list.add(null);
		System.out.println("list = "+list);

		try
		{
			String str = list.get(index);
			System.out.println("str = " + str);
			System.out.println("length = " + str.length());
		}
		catch (IndexOutOfBoundsException indexOutOfBoundsException)
		{
			System.out.println("Enter the index value "
					+ "less than or equal to 1.");
		}
		catch (NullPointerException nullPointerException)
		{
			System.out.println("String value is null,so "
					+ "cannot calculate the length.");
		}
		
		System.out.println("Normal flow..");

	}
}
