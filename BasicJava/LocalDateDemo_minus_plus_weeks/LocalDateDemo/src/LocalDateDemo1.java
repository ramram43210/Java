import java.time.LocalDate;

public class LocalDateDemo1
{

	public static void main(String[] args)
	{
		LocalDate currentDate = LocalDate.now();
		System.out.println("currentDate = " + currentDate);

		/*
		 * Parameters:
		 * 
		 * weeksToSubtract - the weeks to subtract, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the weeks
		 * subtracted, not null
		 */
		LocalDate dateAfterWeekChanged = currentDate.minusWeeks(2);
		System.out.println("dateAfterWeekChanged = " + dateAfterWeekChanged);
	}

}
