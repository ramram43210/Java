import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to validate Time in 24 Hours format with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		List<String> validTimeList = Arrays.asList("2:00", "23:00",	"14:50");

		Time24HoursValidator time24HoursValidator = new Time24HoursValidator();

		for (String time : validTimeList)
		{
			System.out.println(time + " is Valid? = "
					+ time24HoursValidator.validate(time));
		}

		System.out.println("--------------------------------------");

		List<String> inValidTimeList = Arrays.asList("24:00", "13:1", "1:9", "110:20");

		for (String time : inValidTimeList)
		{
			System.out.println(time + " is Valid? = "
					+ time24HoursValidator.validate(time));
		}


	}

}