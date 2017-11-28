import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{
		String inputCharSeq = "Hello-peter-how-are-you?";

		String regex = "-";
		
		Pattern pattern = Pattern.compile(regex);

		/*
		 * The split() method in the Pattern class can split a text
		 * into an array of String's, using the regular expression
		 * (the pattern) as delimiter.
		 */
		String[] stringArrry = pattern.split(inputCharSeq);

		System.out.println("stringArrry length = " + stringArrry.length);

		for (String strValue : stringArrry)
		{
			System.out.println("strValue = " + strValue);
		}
	}

}
