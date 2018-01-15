import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo2
{

	public static void main(String[] args)
	{

		String strDate = "2017-12-03T10:15:30+01:00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;

		/*
		 * Parameters:
		 * 
		 * text - the text to parse, not null
		 * 
		 * formatter - the formatter to use, not null
		 * 
		 * Returns:
		 * 
		 * the parsed local date-time, not null
		 */

		LocalDateTime localDateTime = LocalDateTime.parse(strDate,
				dateTimeFormatter);

		System.out.println(localDateTime);
	}

}
