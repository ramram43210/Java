import java.time.DayOfWeek;

public class DayOfWeekDemo1
{
	public static void main(String[] args)
	{
		DayOfWeek dayOfWeek = DayOfWeek.of(5);
		System.out.println("dayOfWeek = " + dayOfWeek);

		/*
		 * Parameters:
		 * 
		 * days - the days to subtract, positive or negative
		 * 
		 * Returns:
		 * 
		 * the resulting day-of-week, not null
		 */
		dayOfWeek = dayOfWeek.minus(2);
		System.out.println("dayOfWeek = " + dayOfWeek);
	}

}
