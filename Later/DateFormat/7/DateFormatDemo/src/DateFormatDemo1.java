import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatDemo1
{
	public static void main(String[] args)
	{

		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		String s = dateFormat.format(date);

		/*
		 * Returns:
		 * 
		 * the calendar associated with this date/time formatter.
		 */
		Calendar cal = dateFormat.getCalendar();
		System.out.println(cal.getTime());

	}

}
