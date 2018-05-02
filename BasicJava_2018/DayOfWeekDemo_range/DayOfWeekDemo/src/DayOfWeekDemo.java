import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{

		DayOfWeek dayOfWeek = DayOfWeek.of(1);

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ValueRange valueRange = dayOfWeek.range(ChronoField.DAY_OF_WEEK);

		System.out.println(valueRange);
		System.out.println("Min = " + valueRange.getMinimum());
		System.out.println("Max = " + valueRange.getMaximum());

	}

}
