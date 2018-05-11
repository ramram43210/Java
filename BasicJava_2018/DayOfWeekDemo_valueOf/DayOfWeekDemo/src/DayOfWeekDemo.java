import java.time.DayOfWeek;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * name - the name of the enum constant to be returned.
		 * 
		 * Returns:
		 * 
		 * the enum constant with the specified name
		 */
		DayOfWeek dayOfWeek = DayOfWeek.valueOf("FRIDAY");
		System.out.println("dayOfWeek = " + dayOfWeek);
	}

}
