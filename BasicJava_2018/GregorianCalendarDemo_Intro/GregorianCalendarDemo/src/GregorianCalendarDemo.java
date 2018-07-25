import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = new GregorianCalendar();

		/*
		 * Returns a Date object representing this Calendar's time
		 * value
		 */
		Date date = cal.getTime();
		System.out.println(date);
	}
}
