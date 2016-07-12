import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Another simple usage of ByteArrayInputStream would be
 * a way of capitalizing the input from the user.
 */

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name : ");
		String message = scanner.nextLine();

		scanner.close();

		StringBuilder sb = new StringBuilder();

		ByteArrayInputStream str = new ByteArrayInputStream(
				message.getBytes());

		int ch;
		while ((ch = str.read()) != -1)
		{
			sb.append(Character.toUpperCase((char) ch));
		}
		System.out.println("Your capitalized name: " + sb.toString());

	}
}
