import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.parse("12:30:30");

		/*
		 * Parameters:
		 * 
		 * date - the date to combine with, not null
		 * 
		 * Returns:the local date-time formed from this time and the
		 * specified date, not null
		 */

		LocalDateTime datetime = time.atDate(date);
		System.out.println(datetime);
	}

}
