import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarDemo2
{
	public static void main(String[] args)
	{
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println("timeZone = "+timeZone);
		
		/*
		 * Parameters:
		 * 
		 * zone - the given time zone.
		 */
		GregorianCalendar cal = new GregorianCalendar(timeZone);
		System.out.println(cal.getTime());
	}
}
