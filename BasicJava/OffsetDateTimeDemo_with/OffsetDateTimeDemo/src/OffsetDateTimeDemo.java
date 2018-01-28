import java.time.OffsetDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{
		OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2017-02-03T10:15:30+01:00");
		System.out.println("offsetDateTime1       = "+offsetDateTime1);
		
		OffsetDateTime offsetDateTime2 = offsetDateTime1.withYear(2018);
		System.out.println("\nYear changed          = "+offsetDateTime2);

		OffsetDateTime offsetDateTime3 = offsetDateTime2.withMonth(10);
		System.out.println("Month changed         = "+offsetDateTime3);

		OffsetDateTime offsetDateTime4 = offsetDateTime3.withDayOfMonth(25);
		System.out.println("Day changed           = "+offsetDateTime4);

		OffsetDateTime offsetDateTime5 = offsetDateTime4.withHour(1);
		System.out.println("Hour changed          = "+offsetDateTime5);

		OffsetDateTime offsetDateTime6 = offsetDateTime5.withMinute(10);
		System.out.println("Min changed           = "+offsetDateTime6);

		OffsetDateTime offsetDateTime7 = offsetDateTime6.withSecond(20);
		System.out.println("Sec changed           = "+offsetDateTime7);

		OffsetDateTime offsetDateTime8 = offsetDateTime7.withNano(50);
		System.out.println("NanoSec changed       = "+offsetDateTime8);
		
	}

}
