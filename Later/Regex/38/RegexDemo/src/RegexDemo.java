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
		List<String> validTimeList = Arrays.asList("2:00", "23:00", "14:50");

		Time24HoursValidator time12HoursValidator = new Time24HoursValidator();

		validTimeList.stream().forEach(time -> System.out.println(
				time + " is Valid? = " + time12HoursValidator.validate(time)));

		System.out.println("--------------------------------------");
		
		List<String> inValidTimeList = Arrays.asList("24:00", "13:1", "1:9","110:20");
		
		inValidTimeList.stream().forEach(time -> System.out.println(
				time + " is Valid? = " + time12HoursValidator.validate(time)));


	}

}