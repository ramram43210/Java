import java.time.DayOfWeek;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{

		/*
		 * Parameters:
		 * 
		 * dayOfWeek - the day-of-week to represent, from 1 (Monday)
		 * to 7 (Sunday)
		 * 
		 * Returns:
		 * 
		 * the day-of-week singleton, not null
		 */
		DayOfWeek dayOfWeek = DayOfWeek.of(1);
		System.out.println("dayOfWeek = "+dayOfWeek);
		
		System.out.println("Name = "+dayOfWeek.name());
		System.out.println("Value = "+dayOfWeek.getValue());
		System.out.println("Ordinal = "+dayOfWeek.ordinal());

	}

}
