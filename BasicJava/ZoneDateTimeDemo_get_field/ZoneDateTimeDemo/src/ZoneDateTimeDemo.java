import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		int dayOfMonth = zonedDateTime.get(ChronoField.DAY_OF_MONTH);
		System.out.println("dayOfMonth  = " + dayOfMonth);
		
		int monthOfYear = zonedDateTime.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYear = " + monthOfYear);
	}

}
