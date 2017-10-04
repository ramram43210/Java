import java.time.OffsetDateTime;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date-time using the system clock, not
		 * null.
		 */
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);
		
		System.out.println("Year  = "+offsetDateTime.getYear());
		System.out.println("Month = "+offsetDateTime.getMonth());
		System.out.println("Month Value = "+offsetDateTime.getMonthValue());
		System.out.println("getDayOfMonth = "+offsetDateTime.getDayOfMonth());
		System.out.println("Hour = "+offsetDateTime.getHour());
		System.out.println("Min = "+offsetDateTime.getMinute());
		System.out.println("Second = "+offsetDateTime.getSecond());
		System.out.println("Nano Second = "+offsetDateTime.getNano());
		System.out.println("Offset = "+offsetDateTime.getOffset());
		System.out.println("DayOfYear = "+offsetDateTime.getDayOfYear());
		System.out.println("DayOfWeek = "+offsetDateTime.getDayOfWeek());
		
	}

}
