import java.time.LocalDateTime;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime1 = LocalDateTime.parse("2017-01-03T20:25:30");
		System.out.println("date and Time         = "+localDateTime1);

		LocalDateTime localDateTime2 = localDateTime1.withYear(2018);
		System.out.println("\nYear changed          = "+localDateTime2);

		LocalDateTime localDateTime3 = localDateTime2.withMonth(10);
		System.out.println("Month changed         = "+localDateTime3);

		LocalDateTime localDateTime4 = localDateTime3.withDayOfMonth(25);
		System.out.println("Day changed           = "+localDateTime4);

		LocalDateTime localDateTime5 = localDateTime4.withHour(1);
		System.out.println("Hour changed          = "+localDateTime5);

		LocalDateTime localDateTime6 = localDateTime5.withMinute(10);
		System.out.println("Min changed           = "+localDateTime6);

		LocalDateTime localDateTime7 = localDateTime6.withSecond(20);
		System.out.println("Sec changed           = "+localDateTime7);

		LocalDateTime localDateTime8 = localDateTime7.withNano(50);
		System.out.println("NanoSec changed       = "+localDateTime8);

	}

}
