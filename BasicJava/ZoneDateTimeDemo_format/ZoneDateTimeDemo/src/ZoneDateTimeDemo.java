import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;

		/*
		 * Parameters:
		 * 
		 * formatter - the formatter to use, not null
		 * 
		 * Returns:
		 * 
		 * the formatted date-time string, not null
		 */
		String formatedDateTime = zonedDateTime.format(dateTimeFormatter);
		System.out.println("ISO_DATE = "+formatedDateTime);
		
		dateTimeFormatter = DateTimeFormatter.ISO_TIME;
		formatedDateTime = zonedDateTime.format(dateTimeFormatter);
		System.out.println("ISO_TIME = "+formatedDateTime);
	}

}
