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
		List<String> ssnList = new ArrayList<String>();
		ssnList.add("123-45-6789");
		ssnList.add("9876-5-4321");
		ssnList.add("987-65-4321 (G)");
		ssnList.add("987-65-4321");
		ssnList.add("192-83-7465");

		String ssnRegex = "^(\\d{3}-\\d{2}-\\d{4})";	
		
		for (String ssn : ssnList)
		{
			if (ssn.matches(ssnRegex))
			{
				System.out.println("Found good SSN: " + ssn);
			}
		}
	}

}