import java.util.Calendar;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Parameters:
		 * 
		 * field - the given calendar field.
		 * 
		 * Returns:
		 * 
		 * the value for the given calendar field.
		 */
		System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
		System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
		System.out.println("Calendar's Day: " + cal.get(Calendar.DAY_OF_MONTH));

	}

}
