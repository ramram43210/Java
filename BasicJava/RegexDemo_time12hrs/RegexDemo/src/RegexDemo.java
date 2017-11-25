import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to validate Time in 12 Hours format with regular expression
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		List<String> validTimeList = Arrays.asList("2:00 am", "2:00 AM", "12:50 pm");

		Time12HoursValidator time12HoursValidator = new Time12HoursValidator();

		
		for (String time : validTimeList)
		{
			System.out.println(
					time + " is Valid? = " + time12HoursValidator.validate(time));
		}
		
		

		System.out.println("--------------------------------------");
		
		List<String> inValidTimeList = Arrays.asList("0:00 am", "23:00 AM", "12:90 pm","11:20 GM");
		
		for (String time : inValidTimeList)
		{
			System.out.println(
					time + " is Valid? = " + time12HoursValidator.validate(time));
		}


	}

}