import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay time = MonthDay.now();

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:the value for the field
		 */

		System.out.println("DAY_OF_MONTH = "+ time.get(ChronoField.DAY_OF_MONTH));

		System.out.println("MONTH_OF_YEAR = "+ time.get(ChronoField.MONTH_OF_YEAR));
	}

}
