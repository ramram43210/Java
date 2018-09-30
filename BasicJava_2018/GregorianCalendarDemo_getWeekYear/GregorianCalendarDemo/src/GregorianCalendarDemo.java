import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar
				.getInstance();

		System.out.println(cal.getTime());

		/*
		 * Returns:
		 * 
		 * the week year represented by this GregorianCalendar. If the
		 * ERA value is BC, the year is represented by 0 or a negative
		 * number: BC 1 is 0, BC 2 is -1, BC 3 is -2, and so on.
		 */
		
		int weekYear = cal.getWeekYear();
		System.out.println("weekYear = "+weekYear);
		
		/*
		 * Returns: the Gregorian cutover date for this
		 * GregorianCalendar object.
		 */
		Date date = cal.getGregorianChange();
		System.out.println(date);
	}
}
