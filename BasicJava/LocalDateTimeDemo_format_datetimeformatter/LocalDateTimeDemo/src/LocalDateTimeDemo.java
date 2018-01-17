import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Before Formatting = " + localDateTime);

		/*
		 * Parameters:
		 * 
		 * pattern - the pattern to use, not null
		 * 
		 * Returns:
		 * 
		 * the formatter based on the pattern, not null
		 * 
		 */

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm:ss");

		/*
		 * Parameters:
		 * 
		 * formatter - the formatter to use, not null
		 * 
		 * Returns:
		 * 
		 * the formatted date-time string, not null
		 * 
		 */
		String formatDateTime = localDateTime.format(dateTimeFormatter);
		System.out.println("After Formatting  = " + formatDateTime);
	}

}
