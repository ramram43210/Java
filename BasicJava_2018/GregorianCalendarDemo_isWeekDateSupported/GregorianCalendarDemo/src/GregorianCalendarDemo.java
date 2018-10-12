import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println(cal.getTime());

		/*
		 * Returns:true (always)
		 */		
		boolean isWeekDateSupported = cal.isWeekDateSupported();
		System.out.println(isWeekDateSupported);
	}
}
