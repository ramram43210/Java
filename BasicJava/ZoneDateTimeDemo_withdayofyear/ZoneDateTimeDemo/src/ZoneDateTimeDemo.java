import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{

		ZonedDateTime zonedDateTime1 = ZonedDateTime
				.parse("2017-02-03T10:15:30+01:00");
		
		System.out.println("zonedDateTime1    = " + zonedDateTime1);
		/*
		 * Parameters:
		 * 
		 * dayOfYear - the day-of-year to set in the result, from 1 to
		 * 365-366
		 * 
		 * Returns:
		 * 
		 * a ZonedDateTime based on this date with the requested day,
		 * not null
		 */
		ZonedDateTime zonedDateTime2 = zonedDateTime1.withDayOfYear(150);
		System.out.println("DayOfYear changed = " + zonedDateTime2);

	}

}
