import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDemo
{

	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalTime localTime = LocalTime.parse("12:30:30");
		System.out.println(localTime);

		/*
		 * Parameters:
		 * 
		 * date - the date to combine with, not null
		 * 
		 * Returns:
		 * 
		 * the local date-time formed from this time and the specified
		 * date, not null
		 */

		LocalDateTime localDatetime = localTime.atDate(localDate);
		System.out.println(localDatetime);
	}

}
