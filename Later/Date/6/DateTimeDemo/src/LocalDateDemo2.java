import java.time.LocalDate;

public class LocalDateDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Obtains an instance of LocalDate from a text string such as
		 * 2007-12-03
		 */
		LocalDate date = LocalDate.parse("2007-12-03");
		System.out.println("date = " + date);

		/*
		 * Parameters:
		 * 
		 * weeksToAdd - the weeks to add, may be negative
		 * 
		 * Returns:a LocalDate based on this date with the weeks
		 * added, not null
		 */
		LocalDate dateAfterWeekChanged = date.plusWeeks(3);
		System.out.println(
				"dateAfterWeekChanged = " + dateAfterWeekChanged);
	}

}
