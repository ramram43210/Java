import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to validate date with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		List<String> validDateList = Arrays.asList("01/01/2020", "31/01/2020",
				"31/8/2010", "1/1/2010");

		DateValidator dateValidator = new DateValidator();

		for (String date : validDateList)
		{
			System.out.println(
					date + " is Valid? = " + dateValidator.validate(date));
		}

		System.out.println("--------------------------------------");

		List<String> inValidDateList = Arrays.asList("32/1/2010", "31/9/2010",
				"333/2/200f", "110:20");

		for (String date : inValidDateList)
		{
			System.out.println(
					date + " is Valid? = " + dateValidator.validate(date));
		}


	}

}