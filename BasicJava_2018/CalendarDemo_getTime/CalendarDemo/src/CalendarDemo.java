import java.util.Calendar;
import java.util.Date;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:a Date representing the time value.
		 */
		Date date = cal.getTime();
		System.out.println(" date = " + date);

	}

}
