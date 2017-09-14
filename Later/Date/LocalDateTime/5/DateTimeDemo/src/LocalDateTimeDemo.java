import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * text - the text to parse such as "2007-12-03T10:15:30", not
		 * null
		 * 
		 * Returns:the parsed local date-time, not null
		 */
		LocalDateTime localDateTime1 = LocalDateTime.parse("2020-02-03T10:15:30");
		System.out.println(localDateTime1);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
		String date = "2017-12-03T10:15:30+01:00";

		/*
		 * Parameters: 
		 * 
		 * text - the text to parse, not null
		 * 
		 * formatter - the formatter to use, not nullReturns:the
		 * parsed local date-time, not null
		 */

		LocalDateTime localDateTime2 = LocalDateTime.parse(date,dateTimeFormatter);
		System.out.println(localDateTime2);
	}

}
