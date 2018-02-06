import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date-time using the system clock, not
		 * null.
		 */
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
		System.out.println("Current date and time = "+zonedDateTime1);
		
		ZonedDateTime zonedDateTime2 = zonedDateTime1.plusYears(2);
		System.out.println("\nYear changed          = "+zonedDateTime2);

		ZonedDateTime zonedDateTime3 = zonedDateTime2.plusMonths(3);
		System.out.println("Month changed         = "+zonedDateTime3);

		ZonedDateTime zonedDateTime4 = zonedDateTime3.plusDays(5);
		System.out.println("Day changed           = "+zonedDateTime4);

		ZonedDateTime zonedDateTime5 = zonedDateTime4.plusHours(1);
		System.out.println("Hour changed          = "+zonedDateTime5);

		ZonedDateTime zonedDateTime6 = zonedDateTime5.plusMinutes(10);
		System.out.println("Min changed           = "+zonedDateTime6);

		ZonedDateTime zonedDateTime7 = zonedDateTime6.plusSeconds(20);
		System.out.println("Sec changed           = "+zonedDateTime7);

		ZonedDateTime zonedDateTime8 = zonedDateTime7.plusNanos(50);
		System.out.println("NanoSec changed       = "+zonedDateTime8);

		ZonedDateTime zonedDateTime9 = zonedDateTime8.plusWeeks(3);
		System.out.println("Week changed          = "+zonedDateTime9);
	}

}
