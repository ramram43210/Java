import java.time.DayOfWeek;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo2
{
	public static void main(String[] args)
	{

		 DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
		 System.out.println("dayOfWeek = "+dayOfWeek);

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
