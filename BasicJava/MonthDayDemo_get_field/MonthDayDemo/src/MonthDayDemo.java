import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay monthDay = MonthDay.now();
		System.out.println(monthDay);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */

		int monthOfYear = monthDay.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYear = " + monthOfYear);

		int dayOfMonth = monthDay.get(ChronoField.DAY_OF_MONTH);
		System.out.println("dayOfMonth = " + dayOfMonth);

	}

}
