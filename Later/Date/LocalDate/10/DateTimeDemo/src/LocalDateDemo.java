import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.parse("2017-11-23");

		/*
		 * Parameters: field - the field to get, not null
		 * 
		 * Returns:the value for the field
		 */
		int dayOfTheMonth = date.get(ChronoField.DAY_OF_MONTH);
		System.out.println(dayOfTheMonth);
	}

}
