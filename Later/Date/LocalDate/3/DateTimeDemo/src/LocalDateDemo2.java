import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * year - the year to represent, from MIN_YEAR to MAX_YEAR
		 * 
		 * month - the month-of-year to represent, from 1 (January) to
		 * 12 (December)
		 * 
		 * dayOfMonth - the day-of-month to represent, from 1 to 31
		 * 
		 * Returns:the local date, not null
		 */
		LocalDate date = LocalDate.of(2027, 7, 25);

		/*
		 * Parameters:
		 * 
		 * hour - the hour-of-day to use, from 0 to 23
		 * 
		 * minute - the minute-of-hour to use, from 0 to 59
		 * 
		 * second - the second-of-minute to represent, from 0 to 59
		 * 
		 * Returns:the local date-time formed from this date and the
		 * specified time, not null
		 */
		LocalDateTime datetime = date.atTime(2, 20, 9);
		System.out.println(datetime);
	}

}
