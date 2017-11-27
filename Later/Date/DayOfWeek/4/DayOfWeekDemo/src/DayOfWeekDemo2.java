import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo2
{
	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.of(2017, Month.JUNE, 21);
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field, within the valid range of values
		 */
		int value = dayOfWeek.get(ChronoField.DAY_OF_WEEK);
		System.out.println(value);

	}

}
