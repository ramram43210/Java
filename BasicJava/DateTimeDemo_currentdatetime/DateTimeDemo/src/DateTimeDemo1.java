import java.time.Clock;

public class DateTimeDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date using the system clock and default
		 * time-zone, not null
		 */
		System.out.println(java.time.LocalDate.now());

		/*
		 * Returns:the current time using the system clock and default
		 * time-zone, not null
		 */
		System.out.println(java.time.LocalTime.now());

		/*
		 * Returns:the current date-time using the system clock and
		 * default time-zone, not null
		 */
		System.out.println(java.time.LocalDateTime.now());

		/*
		 * systemUTC(): Returns:a clock that uses the best available
		 * system clock in the UTC zone, not null.
		 * 
		 * instant(): Returns:the current instant from this clock, not
		 * null.
		 */
		Clock clock = java.time.Clock.systemUTC();
		System.out.println(clock.instant());
	}

}
