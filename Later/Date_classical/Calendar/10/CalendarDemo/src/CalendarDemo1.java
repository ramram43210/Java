import java.util.Calendar;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the current time as UTC milliseconds from the
		 * epoch.
		 */
		long timeInMs = cal.getTimeInMillis();
		System.out.println("timeInMs = " + timeInMs);
	}
}
