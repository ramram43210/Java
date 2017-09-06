import java.time.LocalDate;

public class LocalDateDemo1
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println("date = " + date);

		/*
		 * Parameters:
		 * 
		 * weeksToSubtract - the weeks to subtract, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the weeks
		 * subtracted, not null
		 */
		LocalDate dateAfterWeekChanged = date.minusWeeks(2);
		System.out.println(
				"dateAfterWeekChanged = " + dateAfterWeekChanged);
	}

}
