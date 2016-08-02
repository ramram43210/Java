import java.util.ArrayList;
import java.util.Scanner;

public class ScannerDemo
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		try
		{
			ArrayList<String> listOfNames = new ArrayList<String>();
			scanner = new Scanner(System.in);
			System.out.print("Enter the name: ");
			while (scanner.hasNextLine())
			{
				
				String name = scanner.nextLine();
				if (name.equalsIgnoreCase("quit"))
				{
					break;
				}
				listOfNames.add(name);
				System.out.print("Enter the name: ");
			}
			System.out.println("listOfNames =  "+listOfNames);
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
