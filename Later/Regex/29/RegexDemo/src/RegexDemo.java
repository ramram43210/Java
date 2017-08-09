import java.util.ArrayList;
import java.util.List;

/**
 * 
 * A Social Security Number (SSN) consists of nine digits, commonly written as
 * three fields separated by hyphens: AAA-GG-SSSS. 
 * 
 * The first three-digit field is called the "area number". 
 * The central, two-digit field is called the group number". 
 * The final, four-digit field is called the "serial number"
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		List<String> input = new ArrayList<String>();
		input.add("123-45-6789");
		input.add("9876-5-4321");
		input.add("987-65-4321 (G)");
		input.add("987-65-4321 ");
		input.add("192-83-7465");

		for (String ssn : input)
		{
			if (ssn.matches("^(\\d{3}-\\d{2}-\\d{4})"))
			{
				System.out.println("Found good SSN: " + ssn);
			}
		}
	}

}