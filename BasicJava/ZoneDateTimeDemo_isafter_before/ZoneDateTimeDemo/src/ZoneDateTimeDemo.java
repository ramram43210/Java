import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{

		ZonedDateTime zonedDateTime1 = ZonedDateTime
				.parse("2016-02-03T12:30:30+01:00");
		
		System.out.println(zonedDateTime1);

		ZonedDateTime zonedDateTime2 = ZonedDateTime
				.parse("2017-02-03T12:30:30+01:00");
		
		System.out.println(zonedDateTime2);

		/*
		 * Returns:true if this is equal to the other date-time
		 */
		System.out.println(zonedDateTime1.equals(zonedDateTime2));

		/*
		 * Returns:true if this date-time is after the specified
		 * date-time
		 */
		System.out.println(zonedDateTime1.isAfter(zonedDateTime2));

		/*
		 * Returns:true if this date-time is before the specified
		 * date-time
		 */

		System.out.println(zonedDateTime1.isBefore(zonedDateTime2));
	}

}
