import java.time.OffsetDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		OffsetDateTime offsetDateTime1 = OffsetDateTime
				.parse("2016-02-03T12:30:30+01:00");
		System.out.println(offsetDateTime1);

		OffsetDateTime offsetDateTime2 = OffsetDateTime
				.parse("2017-02-03T12:30:30+01:00");
		System.out.println(offsetDateTime2);
		/*
		 * Returns:true if this is equal to the other date-time
		 */
		System.out.println(offsetDateTime1.equals(offsetDateTime2));

		/*
		 * Returns:true if this date-time is after the specified
		 * date-time
		 */
		System.out.println(offsetDateTime1.isAfter(offsetDateTime2));

		/*
		 * Returns:true if this date-time is before the specified
		 * date-time
		 */

		System.out.println(offsetDateTime1.isBefore(offsetDateTime2));

	}

}
