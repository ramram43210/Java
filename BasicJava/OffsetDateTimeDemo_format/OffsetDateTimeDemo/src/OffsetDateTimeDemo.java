import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);
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
		String formatedDate = offsetDateTime.format(dateTimeFormatter);
		System.out.println("ISO_DATE = " + formatedDate);

		dateTimeFormatter = DateTimeFormatter.ISO_TIME;
		formatedDate = offsetDateTime.format(dateTimeFormatter);
		System.out.println("ISO_TIME = " + formatedDate);

	}

}
