import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		/*
		 * Field number for get and set indicating the era, e.g., AD
		 * or BC in the Julian calendar. This is a calendar-specific
		 * value; see subclass documentation.
		 */
		System.out.println(now.get(Calendar.ERA));
	}

}
