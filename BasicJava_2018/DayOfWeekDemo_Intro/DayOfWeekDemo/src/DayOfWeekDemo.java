import java.time.DayOfWeek;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{

		DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

		/*
		 * Returns:the name of this enum constant
		 */
		System.out.println("Name = "+dayOfWeek.name());
		/*
		 * Returns:the day-of-week, from 1 (Monday) to 7 (Sunday)
		 */
		System.out.println("Value = "+dayOfWeek.getValue());
		/*
		 * Returns:the ordinal of this enumeration constant
		 */
		System.out.println("Ordinal = "+dayOfWeek.ordinal());

	}

}
