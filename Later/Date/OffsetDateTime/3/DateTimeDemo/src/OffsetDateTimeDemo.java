import java.time.OffsetDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date-time using the system clock, not
		 * null.
		 */
		OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
		System.out.println(offsetDateTime1);
		
		OffsetDateTime offsetDateTime2 = offsetDateTime1.plusYears(2);
		System.out.println("\nYear changed          = "+offsetDateTime2);

		OffsetDateTime offsetDateTime3 = offsetDateTime2.plusMonths(3);
		System.out.println("Month changed         = "+offsetDateTime3);

		OffsetDateTime offsetDateTime4 = offsetDateTime3.plusDays(5);
		System.out.println("Day changed           = "+offsetDateTime4);

		OffsetDateTime offsetDateTime5 = offsetDateTime4.plusHours(1);
		System.out.println("Hour changed          = "+offsetDateTime5);

		OffsetDateTime offsetDateTime6 = offsetDateTime5.plusMinutes(10);
		System.out.println("Min changed           = "+offsetDateTime6);

		OffsetDateTime offsetDateTime7 = offsetDateTime6.plusSeconds(20);
		System.out.println("Sec changed           = "+offsetDateTime7);

		OffsetDateTime offsetDateTime8 = offsetDateTime7.plusNanos(50);
		System.out.println("NanoSec changed       = "+offsetDateTime8);

		OffsetDateTime offsetDateTime9 = offsetDateTime8.plusWeeks(3);
		System.out.println("Week changed          = "+offsetDateTime9);
		
	}

}
