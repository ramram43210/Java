import java.time.LocalDateTime;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime1 = LocalDateTime
				.parse("2016-02-03T12:30:30");
		System.out.println("localDateTime1 = "+localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime
				.parse("2017-03-03T12:30:30");
			
		System.out.println("localDateTime2 = "+localDateTime2);
		
		/*
		 * Returns:true if this is equal to the other date-time
		 */
		System.out.println(localDateTime1.equals(localDateTime2));

		/*
		 * Returns:true if this date-time is after the specified
		 * date-time
		 */
		System.out.println(localDateTime1.isAfter(localDateTime2));

		/*
		 * Returns:true if this date-time is before the specified
		 * date-time
		 */

		System.out.println(localDateTime1.isBefore(localDateTime2));
	}

}
