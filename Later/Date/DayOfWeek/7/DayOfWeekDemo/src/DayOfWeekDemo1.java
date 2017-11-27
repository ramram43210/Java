import java.time.DayOfWeek;

public class DayOfWeekDemo1
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
		System.out.println("Name = "+dayOfWeek.name());
		System.out.println("Value = "+dayOfWeek.getValue());
		System.out.println("Ordinal = "+dayOfWeek.ordinal());
	}

}
