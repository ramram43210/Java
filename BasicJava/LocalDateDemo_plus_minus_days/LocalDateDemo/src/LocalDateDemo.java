import java.time.LocalDate;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date using the system clock and default
		 * time-zone, not null
		 */
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today date = " + todayDate);

		/*
		 * Parameters:
		 * 
		 * daysToSubtract - the days to subtract, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the days
		 * subtracted, not null
		 */
		LocalDate yesterdayDate = todayDate.minusDays(1);
		System.out.println("Yesterday date = " + yesterdayDate);

		/*
		 * Parameters:
		 * 
		 * daysToAdd - the days to add, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the days added,
		 * not null
		 * 
		 */
		LocalDate tomorrowDate = todayDate.plusDays(1);
		System.out.println("Tommorow date = " + tomorrowDate);
	}

}
