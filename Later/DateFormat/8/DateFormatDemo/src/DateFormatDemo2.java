import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatDemo2
{
	public static void main(String[] args)
	{
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		String s = dateFormat.format(new Date());

		System.out.println(dateFormat.getCalendar());

		System.out.println(dateFormat.isLenient());

		/*
		 * Specify whether or not date/time parsing is to be lenient.
		 * With lenient parsing, the parser may use heuristics to
		 * interpret inputs that do not precisely match this object's
		 * format. With strict parsing, inputs must match this
		 * object's format.
		 * 
		 * Parameters:
		 * 
		 * lenient - when true, parsing is lenient
		 */
		dateFormat.setLenient(false);

		System.out.println(dateFormat.getCalendar());

		System.out.println(dateFormat.isLenient());

	}
}
