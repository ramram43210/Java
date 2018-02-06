import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2017-02-03T10:15:30+01:00");
		System.out.println("zonedDateTime1        = "+zonedDateTime1);
		
		ZonedDateTime zonedDateTime2 = zonedDateTime1.withYear(2018);
		System.out.println("\nYear changed          = "+zonedDateTime2);

		ZonedDateTime zonedDateTime3 = zonedDateTime2.withMonth(10);
		System.out.println("Month changed         = "+zonedDateTime3);

		ZonedDateTime zonedDateTime4 = zonedDateTime3.withDayOfMonth(25);
		System.out.println("Day changed           = "+zonedDateTime4);

		ZonedDateTime zonedDateTime5 = zonedDateTime4.withHour(1);
		System.out.println("Hour changed          = "+zonedDateTime5);

		ZonedDateTime zonedDateTime6 = zonedDateTime5.withMinute(10);
		System.out.println("Min changed           = "+zonedDateTime6);

		ZonedDateTime zonedDateTime7 = zonedDateTime6.withSecond(20);
		System.out.println("Sec changed           = "+zonedDateTime7);

		ZonedDateTime zonedDateTime8 = zonedDateTime7.withNano(50);
		System.out.println("NanoSec changed       = "+zonedDateTime8);
	}

}
