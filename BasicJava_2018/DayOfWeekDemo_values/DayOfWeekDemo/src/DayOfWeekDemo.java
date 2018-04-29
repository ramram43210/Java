import java.time.DayOfWeek;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{

		/*
		 * Returns:
		 * 
		 * an array containing the constants of this enum
		 * type, in the order they are declared
		 */
		DayOfWeek[] dayOfWeekArray = DayOfWeek.values();
		
		for (DayOfWeek dayOfWeek : dayOfWeekArray)
		{
			System.out.println(dayOfWeek);
		}

	}

}
