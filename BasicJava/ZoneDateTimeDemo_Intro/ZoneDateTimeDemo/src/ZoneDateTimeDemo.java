import java.time.ZonedDateTime;

public class ZoneDateTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date-time using the system clock, not
		 * null.
		 */
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		System.out.println("Year  = "+zonedDateTime.getYear());
		System.out.println("Month = "+zonedDateTime.getMonth());
		System.out.println("Month Value = "+zonedDateTime.getMonthValue());
		System.out.println("getDayOfMonth = "+zonedDateTime.getDayOfMonth());
		System.out.println("Hour = "+zonedDateTime.getHour());
		System.out.println("Min = "+zonedDateTime.getMinute());
		System.out.println("Second = "+zonedDateTime.getSecond());
		System.out.println("Nano Second = "+zonedDateTime.getNano());
		System.out.println("Offset = "+zonedDateTime.getOffset());
		System.out.println("DayOfYear = "+zonedDateTime.getDayOfYear());
		System.out.println("DayOfWeek = "+zonedDateTime.getDayOfWeek());
		
	}

}
