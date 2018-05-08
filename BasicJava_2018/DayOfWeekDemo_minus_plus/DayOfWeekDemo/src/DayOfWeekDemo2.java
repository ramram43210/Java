import java.time.DayOfWeek;

public class DayOfWeekDemo2
{
	public static void main(String[] args)
	{

		DayOfWeek dayOfWeek = DayOfWeek.of(5);
		System.out.println("dayOfWeek = " + dayOfWeek);

		/*
		 * Parameters:
		 * 
		 * days - the days to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * the resulting day-of-week, not null
		 */
		dayOfWeek = dayOfWeek.plus(1);
		System.out.println("dayOfWeek = " + dayOfWeek);

	}

}
