import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.parse("2020-12-23");
		System.out.println(localDate);

		/*
		 * Parameters:
		 * 
		 * pattern - the pattern to use, not null
		 * 
		 * Returns:
		 * 
		 * the formatter based on the pattern, not null
		 */
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern("dd/MM/YYYY");

		/*
		 * Parameters:
		 * 
		 * formatter - the formatter to use, not null
		 * 
		 * Returns:
		 * 
		 * the formatted date string, not null
		 */

		String formatedDate = localDate.format(dateTimeFormatter);
		System.out.println(formatedDate);
	}

}
