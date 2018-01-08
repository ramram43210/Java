import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo1
{
	public static void main(String[] args)
	{

		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		String s = dateFormat.format(new Date());

		System.out.println(dateFormat.getCalendar());

		/*
		 * Returns:true if the calendar is lenient; false otherwise.
		 */
		System.out.println(dateFormat.isLenient());

	}

}
