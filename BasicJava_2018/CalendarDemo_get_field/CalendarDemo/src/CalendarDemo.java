import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * public int get(int field)
		 * 
		 * Parameters:
		 * 
		 * field - the given calendar field.
		 * 
		 * Returns:
		 * 
		 * the value for the given calendar field.
		 */
		System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
		// Month - 0[Jan] to 11[Dec]
		System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
		System.out.println("Calendar's Day: " + cal.get(Calendar.DAY_OF_MONTH));

	}

}
