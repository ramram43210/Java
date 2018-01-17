import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime
				.parse("2017-02-03T12:30:30");
		System.out.println(localDateTime);
		
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to format, not null
		 * 
		 * Returns:
		 * 
		 * the formatted string, not null
		 */

		String formatedStrDate = dateTimeFormatter.format(localDateTime);
		System.out.println(formatedStrDate);
	}

}
