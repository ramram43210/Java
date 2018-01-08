import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatDemo2
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		String s = dateFormat.format(date);

		/*
		 * Returns:the time zone associated with the calendar of
		 * DateFormat.
		 */
		TimeZone timeZone = dateFormat.getTimeZone();
		System.out.println(timeZone);
		System.out.println(timeZone.getDisplayName());

	}
}
