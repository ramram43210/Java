import java.time.LocalDate;

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
		LocalDate localDate = LocalDate.of(2027, 7, 25);
		System.out.println(localDate);

	}

}
