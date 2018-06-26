import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns this Calendar's time value in milliseconds.
		 */
		long timeInMs = cal.getTimeInMillis();
		System.out.println("timeInMs = " + timeInMs);
	}
}
