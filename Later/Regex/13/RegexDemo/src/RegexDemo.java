import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Java Regex Finder Example
 *
 */

public class RegexDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter regex pattern:");
			Pattern pattern = Pattern.compile(sc.nextLine());
			Matcher matcher = pattern.matcher("Welcome to india peter");
			boolean found = false;
			while (matcher.find())
			{
				System.out.println("I found the text " + matcher.group()
						+ " starting at index " + matcher.start()
						+ " and ending at index " + matcher.end());
				found = true;
			}
			if (!found)
			{
				System.out.println("No match found.");
			}
		}
	}

}