import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime = " + localDateTime);
		
		
		/*
		 * Returns the date part of this date-time, not null.
		 */
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println("localDate = " + localDate);

		/*
		 * Returns the time part of this date-time, not null.
		 */
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println("localTime = " + localTime);

	}

}
