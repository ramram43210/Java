import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.parse("2017-12-03");

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:the range of valid values for the field, not null
		 */

		System.out.println("Range : " + date.range(ChronoField.DAY_OF_MONTH));
		System.out.println("Range : " + date.range(ChronoField.MONTH_OF_YEAR));
		System.out.println("Range : " + date.range(ChronoField.DAY_OF_YEAR));
	}

}
