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
		String name = scanner.nextLine();

		scanner.close();

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(name.getBytes());

		StringBuilder sb = new StringBuilder();

		int ch;
		while ((ch = byteArrayInputStream.read()) != -1)
		{
			sb.append(Character.toUpperCase((char) ch));
		}
		System.out.println("Your capitalized name: " + sb.toString());

	}
}
