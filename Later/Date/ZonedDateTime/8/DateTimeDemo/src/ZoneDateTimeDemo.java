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
		 * Returns:the formatted date-time string, not null
		 */
		String formatedDate = zonedDateTime.format(dateTimeFormatter);
		System.out.println("ISO_DATE = "+formatedDate);
		
		dateTimeFormatter = DateTimeFormatter.ISO_TIME;
		formatedDate = zonedDateTime.format(dateTimeFormatter);
		System.out.println("ISO_TIME = "+formatedDate);
	}

}
