import java.time.LocalDateTime;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println("Current date and Time = " + localDateTime1);

		LocalDateTime localDateTime2 = localDateTime1.minusYears(2);
		System.out.println("\nYear changed          = " + localDateTime2);

		LocalDateTime localDateTime3 = localDateTime2.minusMonths(3);
		System.out.println("Month changed         = " + localDateTime3);

		LocalDateTime localDateTime4 = localDateTime3.minusDays(5);
		System.out.println("Day changed           = " + localDateTime4);

		LocalDateTime localDateTime5 = localDateTime4.minusHours(1);
		System.out.println("Hour changed          = " + localDateTime5);

		LocalDateTime localDateTime6 = localDateTime5.minusMinutes(10);
		System.out.println("Min changed           = " + localDateTime6);

		LocalDateTime localDateTime7 = localDateTime6.minusSeconds(20);
		System.out.println("Sec changed           = " + localDateTime7);

		LocalDateTime localDateTime8 = localDateTime7.minusNanos(50);
		System.out.println("NanoSec changed       = " + localDateTime8);

		LocalDateTime localDateTime9 = localDateTime8.minusWeeks(3);
		System.out.println("Week changed          = " + localDateTime9);

	}

}
